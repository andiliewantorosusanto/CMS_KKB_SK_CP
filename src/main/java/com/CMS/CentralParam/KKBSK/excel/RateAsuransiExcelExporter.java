package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.view.vwRateAsuransi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RateAsuransiExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwRateAsuransi> listRateAsuransi;
     
    public RateAsuransiExcelExporter(List<vwRateAsuransi> listRateAsuransi) {
        this.listRateAsuransi = listRateAsuransi;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("RateAsuransi");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        int rowCount = 0;
        createCell(row, rowCount++, "Skema", style);      
        createCell(row, rowCount++, "Wilayah", style);   
        createCell(row, rowCount++, "Jenis Pembiayaan", style);    
        createCell(row, rowCount++, "Jenis Kendaraan", style);    
        createCell(row, rowCount++, "Tipe Asuransi", style);
        createCell(row, rowCount++, "Range OTR Start (Rp)", style);
        createCell(row, rowCount++, "Range OTR End (Rp)", style);
        createCell(row, rowCount++, "Tahun Kendaraan Start", style);
        createCell(row, rowCount++, "Tahun Kendaraan End", style);
        createCell(row, rowCount++, "Tahun 1 (%)", style);
        createCell(row, rowCount++, "Tahun 2 (%)", style);
        createCell(row, rowCount++, "Tahun 3 (%)", style);
        createCell(row, rowCount++, "Tahun 4 (%)", style);
        createCell(row, rowCount++, "Tahun 5 (%)", style);
        createCell(row, rowCount++, "Tahun 6 (%)", style);
        createCell(row, rowCount++, "Tahun 7 (%)", style);
        createCell(row, rowCount++, "Tahun 8 (%)", style);
        createCell(row, rowCount++, "Tahun 9 (%)", style);
        createCell(row, rowCount++, "Tahun 10 (%)", style);
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
                 
        for (vwRateAsuransi rateAsuransi : listRateAsuransi) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, rateAsuransi.getNamaSkema(), style);
            createCell(row, columnCount++, rateAsuransi.getWilayahName(), style);
            createCell(row, columnCount++, rateAsuransi.getJenisPembiayaanName(), style);
            createCell(row, columnCount++, rateAsuransi.getJenisKendaraanName(), style);
            createCell(row, columnCount++, rateAsuransi.getTipeAsuransiName(), style);
            createCell(row, columnCount++, rateAsuransi.getStartOtr(), style);
            createCell(row, columnCount++, rateAsuransi.getEndOtr(), style);
            createCell(row, columnCount++, rateAsuransi.getStartYear(), style);
            createCell(row, columnCount++, rateAsuransi.getEndYear(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor1().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor2().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor3().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor4().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor5().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor6().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor7().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor8().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor9().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getTenor10().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, rateAsuransi.getEndBerlaku().toString(), style);
             
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