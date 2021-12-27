package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.view.vwBiayaAdmin;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BiayaAdminExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwBiayaAdmin> listBiayaAdmin;
     
    public BiayaAdminExcelExporter(List<vwBiayaAdmin> listBiayaAdmin) {
        this.listBiayaAdmin = listBiayaAdmin;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("Biaya Admin");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        int rowCount = 0;
        createCell(row, rowCount++, "Skema", style);      
        createCell(row, rowCount++, "Tipe Konsumen", style);       
        createCell(row, rowCount++, "Jenis Kendaraan", style);    
        createCell(row, rowCount++, "Jenis Pembiayaan", style);
        createCell(row, rowCount++, "Cluster", style);
        createCell(row, rowCount++, "NPWP", style);
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
                 
        for (vwBiayaAdmin biayaAdmin : listBiayaAdmin) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, biayaAdmin.getNamaSkema(), style);
            createCell(row, columnCount++, biayaAdmin.getTipeKonsumenName(), style);
            createCell(row, columnCount++, biayaAdmin.getJenisKendaraanName(), style);
            createCell(row, columnCount++, biayaAdmin.getJenisPembiayaanName(), style);
            createCell(row, columnCount++, biayaAdmin.getClusterName(), style);
            createCell(row, columnCount++, biayaAdmin.getDiskonNpwp(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor1(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor2(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor3(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor4(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor5(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor6(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor7(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor8(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor9(), style);
            createCell(row, columnCount++, biayaAdmin.getTenor10(), style);
            createCell(row, columnCount++, biayaAdmin.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, biayaAdmin.getEndBerlaku().toString(), style);
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