package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.view.vwKomponenPH;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KomponenPHExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwKomponenPH> listKomponenPH;
     
    public KomponenPHExcelExporter(List<vwKomponenPH> listKomponenPH) {
        this.listKomponenPH = listKomponenPH;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("KomponenPH");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        int rowCount = 0;
        createCell(row, rowCount++, "Skema", style);      
        createCell(row, rowCount++, "Tipe Konsumen", style);       
        createCell(row, rowCount++, "Jenis Pembiayaan", style);
        createCell(row, rowCount++, "Komponen PH", style);
        createCell(row, rowCount++, "ADDM", style);
        createCell(row, rowCount++, "ADDB", style);
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
                 
        for (vwKomponenPH komponenPh : listKomponenPH) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, komponenPh.getNamaSkema(), style);
            createCell(row, columnCount++, komponenPh.getTipeKonsumenName(), style);
            createCell(row, columnCount++, komponenPh.getJenisPembiayaanName(), style);
            createCell(row, columnCount++, komponenPh.getJenis(), style);
            createCell(row, columnCount++, komponenPh.getAddb(), style);
            createCell(row, columnCount++, komponenPh.getAddm(), style);
             
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