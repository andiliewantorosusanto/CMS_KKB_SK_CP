package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.view.vwPerluasanAsuransi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PerluasanAsuransiExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwPerluasanAsuransi> listPerluasanAsuransi;
     
    public PerluasanAsuransiExcelExporter(List<vwPerluasanAsuransi> listPerluasanAsuransi) {
        this.listPerluasanAsuransi = listPerluasanAsuransi;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("PerluasanAsuransi");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        int rowCount = 0;
        createCell(row, rowCount++, "Skema", style);      
        createCell(row, rowCount++, "Jenis Kendaraan", style);    
        createCell(row, rowCount++, "Wilayah", style);  
        createCell(row, rowCount++, "Tipe Asuransi", style);
        createCell(row, rowCount++, "Jenis Perluasan Asuransi", style);
        createCell(row, rowCount++, "Range OTR Start (Rp)", style);
        createCell(row, rowCount++, "Range OTR End (Rp)", style);
        createCell(row, rowCount++, "Tahun Kendaraan Start", style);
        createCell(row, rowCount++, "Tahun Kendaraan End", style);
        createCell(row, rowCount++, "Tahun 1 (Rp)", style);
        createCell(row, rowCount++, "Tahun 2 (Rp)", style);
        createCell(row, rowCount++, "Tahun 3 (Rp)", style);
        createCell(row, rowCount++, "Tahun 4 (Rp)", style);
        createCell(row, rowCount++, "Tahun 5 (Rp)", style);
        createCell(row, rowCount++, "Tahun 6 (Rp)", style);
        createCell(row, rowCount++, "Tahun 7 (Rp)", style);
        createCell(row, rowCount++, "Tahun 8 (Rp)", style);
        createCell(row, rowCount++, "Tahun 9 (Rp)", style);
        createCell(row, rowCount++, "Tahun 10 (Rp)", style);
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
                 
        for (vwPerluasanAsuransi perluasanAsuransi : listPerluasanAsuransi) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, perluasanAsuransi.getNamaSkema(), style);
            createCell(row, columnCount++, perluasanAsuransi.getJenisKendaraanName(), style);
            createCell(row, columnCount++, perluasanAsuransi.getWilayahName(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTipeAsuransiName(), style);
            createCell(row, columnCount++, perluasanAsuransi.getJenisPerluasanName(), style);
            createCell(row, columnCount++, perluasanAsuransi.getStartOtr(), style);
            createCell(row, columnCount++, perluasanAsuransi.getEndOtr(), style);
            createCell(row, columnCount++, perluasanAsuransi.getStartYear(), style);
            createCell(row, columnCount++, perluasanAsuransi.getEndYear(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor1(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor2(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor3(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor4(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor5(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor6(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor7(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor8(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor9(), style);
            createCell(row, columnCount++, perluasanAsuransi.getTenor10(), style);
            createCell(row, columnCount++, perluasanAsuransi.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, perluasanAsuransi.getEndBerlaku().toString(), style);
             
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