package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.controller.Helper;
import com.CMS.CentralParam.KKBSK.view.vwRateBunga;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RateBungaExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwRateBunga> listRateBunga;
     
    public RateBungaExcelExporter(List<vwRateBunga> listRateBunga) {
        this.listRateBunga = listRateBunga;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("RateBunga");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        int rowCount = 0;
        createCell(row, rowCount++, "Skema", style);      
        createCell(row, rowCount++, "Loan Type", style);       
        createCell(row, rowCount++, "Jenis Kendaraan", style);    
        createCell(row, rowCount++, "Jenis Pembiayaan", style);
        createCell(row, rowCount++, "Cluster", style);
        createCell(row, rowCount++, "Tahun Kendaraan Start", style);
        createCell(row, rowCount++, "Tahun Kendaraan End", style);
        createCell(row, rowCount++, "Tahun 1 (%)", style);
        createCell(row, rowCount++, "Tahun 2 (%)", style);
        createCell(row, rowCount++, "Tahun 3 (%)", style);
        createCell(row, rowCount++, "Tahun 4 (%)", style);
        createCell(row, rowCount++, "Tahun 5 Periode 1 Tahun", style);
        createCell(row, rowCount++, "Tahun 5 Periode 1 (%)", style);
        createCell(row, rowCount++, "Tahun 5 Periode 2 Tahun", style);
        createCell(row, rowCount++, "Tahun 5 Periode 2 (%)", style);

        createCell(row, rowCount++, "Tahun 6 Periode 1 Tahun", style);
        createCell(row, rowCount++, "Tahun 6 Periode 1 (%)", style);
        createCell(row, rowCount++, "Tahun 6 Periode 2 Tahun", style);
        createCell(row, rowCount++, "Tahun 6 Periode 2 (%)", style);

        createCell(row, rowCount++, "Tahun 7 Periode 1 Tahun", style);
        createCell(row, rowCount++, "Tahun 7 Periode 1 (%)", style);
        createCell(row, rowCount++, "Tahun 7 Periode 2 Tahun", style);
        createCell(row, rowCount++, "Tahun 7 Periode 2 (%)", style);

        createCell(row, rowCount++, "Tahun 8 Periode 1 Tahun", style);
        createCell(row, rowCount++, "Tahun 8 Periode 1 (%)", style);
        createCell(row, rowCount++, "Tahun 8 Periode 2 Tahun", style);
        createCell(row, rowCount++, "Tahun 8 Periode 2 (%)", style);

        createCell(row, rowCount++, "Tahun 9 Periode 1 Tahun", style);
        createCell(row, rowCount++, "Tahun 9 Periode 1 (%)", style);
        createCell(row, rowCount++, "Tahun 9 Periode 2 Tahun", style);
        createCell(row, rowCount++, "Tahun 9 Periode 2 (%)", style);

        createCell(row, rowCount++, "Tahun 10 Periode 1 Tahun", style);
        createCell(row, rowCount++, "Tahun 10 Periode 1 (%)", style);
        createCell(row, rowCount++, "Tahun 10 Periode 2 Tahun", style);
        createCell(row, rowCount++, "Tahun 10 Periode 2 (%)", style);
        createCell(row, rowCount++, "Masa Berlaku Start", style);
        createCell(row, rowCount++, "Masa Berlaku End", style);
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
                 
        for (vwRateBunga rateBunga : listRateBunga) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, rateBunga.getNamaSkema(), style);
            createCell(row, columnCount++, rateBunga.getLoanTypeName(), style);
            createCell(row, columnCount++, rateBunga.getJenisKendaraanName(), style);
            createCell(row, columnCount++, rateBunga.getJenisPembiayaanName(), style);
            createCell(row, columnCount++, rateBunga.getClusterName(), style);
            createCell(row, columnCount++, rateBunga.getStartTahunKendaraan(), style);
            createCell(row, columnCount++, rateBunga.getEndTahun(), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor1()), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor2()), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor3()), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor4()), style);

            createCell(row, columnCount++, rateBunga.getTenor5Periode1(), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor5Rate1()), style);
            createCell(row, columnCount++, rateBunga.getTenor5Periode2(), style);
            createCell(row, columnCount++, Helper.parseString( rateBunga.getTenor5Rate2()), style);

            createCell(row, columnCount++, rateBunga.getTenor6Periode1(), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor6Rate1()), style);
            createCell(row, columnCount++, rateBunga.getTenor6Periode2(), style);
            createCell(row, columnCount++, Helper.parseString( rateBunga.getTenor6Rate2()), style);
            
            createCell(row, columnCount++, rateBunga.getTenor7Periode1(), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor7Rate1()), style);
            createCell(row, columnCount++, rateBunga.getTenor7Periode2(), style);
            createCell(row, columnCount++, Helper.parseString( rateBunga.getTenor7Rate2()), style);

            createCell(row, columnCount++, rateBunga.getTenor8Periode1(), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor8Rate1()), style);
            createCell(row, columnCount++, rateBunga.getTenor8Periode2(), style);
            createCell(row, columnCount++, Helper.parseString( rateBunga.getTenor8Rate2()), style);

            createCell(row, columnCount++, rateBunga.getTenor9Periode1(), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor9Rate1()), style);
            createCell(row, columnCount++, rateBunga.getTenor9Periode2(), style);
            createCell(row, columnCount++, Helper.parseString( rateBunga.getTenor9Rate2()), style);

            createCell(row, columnCount++, rateBunga.getTenor10Periode1(), style);
            createCell(row, columnCount++, Helper.parseString(rateBunga.getTenor10Rate1()), style);
            createCell(row, columnCount++, rateBunga.getTenor10Periode2(), style);
            createCell(row, columnCount++, Helper.parseString( rateBunga.getTenor10Rate2()), style);

            createCell(row, columnCount++, rateBunga.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, rateBunga.getEndBerlaku().toString(), style);
             
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