package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.view.vwBiayaProvisi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BiayaProvisiExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwBiayaProvisi> listBiayaProvisi;
     
    public BiayaProvisiExcelExporter(List<vwBiayaProvisi> listBiayaProvisi) {
        this.listBiayaProvisi = listBiayaProvisi;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("BiayaProvisi");
         
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
        createCell(row, rowCount++, "Tenor 1 (Rp)", style);
        createCell(row, rowCount++, "Tenor 1 (%)", style);
        createCell(row, rowCount++, "Tenor 2 (Rp)", style);
        createCell(row, rowCount++, "Tenor 2 (%)", style);
        createCell(row, rowCount++, "Tenor 3 (Rp)", style);
        createCell(row, rowCount++, "Tenor 3 (%)", style);
        createCell(row, rowCount++, "Tenor 4 (Rp)", style);
        createCell(row, rowCount++, "Tenor 4 (%)", style);
        createCell(row, rowCount++, "Tenor 5 (Rp)", style);
        createCell(row, rowCount++, "Tenor 5 (%)", style);
        createCell(row, rowCount++, "Tenor 6 (Rp)", style);
        createCell(row, rowCount++, "Tenor 6 (%)", style);
        createCell(row, rowCount++, "Tenor 7 (Rp)", style);
        createCell(row, rowCount++, "Tenor 7 (%)", style);
        createCell(row, rowCount++, "Tenor 8 (Rp)", style);
        createCell(row, rowCount++, "Tenor 8 (%)", style);
        createCell(row, rowCount++, "Tenor 9 (Rp)", style);
        createCell(row, rowCount++, "Tenor 9 (%)", style);
        createCell(row, rowCount++, "Tenor 10 (Rp)", style);
        createCell(row, rowCount++, "Tenor 10 (%)", style);
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
                 
        for (vwBiayaProvisi biayaProvisi : listBiayaProvisi) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, biayaProvisi.getNamaSkema(), style);
            createCell(row, columnCount++, biayaProvisi.getLoanTypeName(), style);
            createCell(row, columnCount++, biayaProvisi.getJenisKendaraanName(), style);
            createCell(row, columnCount++, biayaProvisi.getJenisPembiayaanName(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor1(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor1Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor2(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor2Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor3(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor3Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor4(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor4Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor5(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor5Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor6(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor6Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor7(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor7Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor8(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor8Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor9(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor9Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor10(), style);
            createCell(row, columnCount++, biayaProvisi.getTenor10Persen(), style);
            createCell(row, columnCount++, biayaProvisi.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, biayaProvisi.getEndBerlaku().toString(), style);
             
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