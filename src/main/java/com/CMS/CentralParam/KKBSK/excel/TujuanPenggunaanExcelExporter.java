package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.view.vwTujuanPenggunaan;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TujuanPenggunaanExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwTujuanPenggunaan> listTujuanPenggunaan;
     
    public TujuanPenggunaanExcelExporter(List<vwTujuanPenggunaan> listTujuanPenggunaan) {
        this.listTujuanPenggunaan = listTujuanPenggunaan;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("TujuanPenggunaan");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "Nama", style);      
        createCell(row, 1, "Produk", style);       
        createCell(row, 2, "Deskripsi", style);    
        createCell(row, 3, "Start Date", style);
        createCell(row, 4, "End Date", style);
    }
     
    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
     
    private void writeDataLines() {
        int rowCount = 1;
 
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
                 
        for (vwTujuanPenggunaan TujuanPenggunaan : listTujuanPenggunaan) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, TujuanPenggunaan.getNama(), style);
            createCell(row, columnCount++, TujuanPenggunaan.getProdukName(), style);
            createCell(row, columnCount++, TujuanPenggunaan.getDeskripsi(), style);
            createCell(row, columnCount++, TujuanPenggunaan.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, TujuanPenggunaan.getEndBerlaku().toString(), style);
        }
    }
     
    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();
         
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
         
        outputStream.close();
         
    }
}