package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.model.data.BiayaFidusia;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BiayaFidusiaExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<BiayaFidusia> listBiayaFidusia;
     
    public BiayaFidusiaExcelExporter(List<BiayaFidusia> listBiayaFidusia) {
        this.listBiayaFidusia = listBiayaFidusia;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("BiayaFidusia");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "Nama Skema", style);      
        createCell(row, 1, "Start PH (Rp)", style);       
        createCell(row, 2, "End PH (Rp)", style);    
        createCell(row, 3, "Biaya Fidusia (Rp)", style);
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
                 
        for (BiayaFidusia biayaFidusia : listBiayaFidusia) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, biayaFidusia.getNamaSkema(), style);
            createCell(row, columnCount++, biayaFidusia.getStartPh(), style);
            createCell(row, columnCount++, biayaFidusia.getEndPh(), style);
            createCell(row, columnCount++, biayaFidusia.getBiaya(), style);
             
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