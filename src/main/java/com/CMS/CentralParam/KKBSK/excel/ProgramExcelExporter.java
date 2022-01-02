package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.model.data.Program;
import com.CMS.CentralParam.KKBSK.view.vwProgram;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProgramExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwProgram> listProgram;
     
    public ProgramExcelExporter(List<vwProgram> listProgram) {
        this.listProgram = listProgram;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("Program");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        int rowCount = 0;
        createCell(row, rowCount++, "Program", style);      
        createCell(row, rowCount++, "Produk", style);       
        createCell(row, rowCount++, "Regional", style);    
        createCell(row, rowCount++, "Branch", style);
        createCell(row, rowCount++, "Skema Rate Asuransi", style);
        createCell(row, rowCount++, "Skema Rate Perluasan Asuransi", style);
        createCell(row, rowCount++, "Skema Rate CP", style);
        createCell(row, rowCount++, "Skema Rate Bunga", style);
        createCell(row, rowCount++, "Skema Biaya Admin", style);
        createCell(row, rowCount++, "Skema Biaya Provisi", style);
        createCell(row, rowCount++, "Skema Minimal DP", style);
        createCell(row, rowCount++, "Skema Biaya Fidusia", style);
        createCell(row, rowCount++, "Skema Komponen PH", style);
        createCell(row, rowCount++, "Skema Usia Kendaraan lunas", style);
        createCell(row, rowCount++, "Skema Garansi Kendaraan", style);
        createCell(row, rowCount++, "Skema Deskripsi", style);
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
                 
        for (vwProgram program : listProgram) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, program.getProgram(), style);
            createCell(row, columnCount++, program.getProdukName(), style);
            createCell(row, columnCount++, program.getRegionalName(), style);
            createCell(row, columnCount++, program.getBranchName(), style);
            createCell(row, columnCount++, program.getRateAsuransiName(), style);
            createCell(row, columnCount++, program.getRatePerluasanName(), style);
            createCell(row, columnCount++, program.getRateCpName(), style);
            createCell(row, columnCount++, program.getRateBungaName(), style);
            createCell(row, columnCount++, program.getBiayaAdminName(), style);
            createCell(row, columnCount++, program.getBiayaProvisiName(), style);
            createCell(row, columnCount++, program.getMinimalDpName(), style);
            createCell(row, columnCount++, program.getBiayaFidusiaName(), style);
            createCell(row, columnCount++, program.getKomponenPhName(), style);
            createCell(row, columnCount++, program.getUsiaKendaraanLunasName(), style);
            createCell(row, columnCount++, "", style);//Skema Kendaraan Lunas
            createCell(row, columnCount++, program.getDeskripsi(), style);
            createCell(row, columnCount++, program.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, program.getEndBerlaku().toString(), style);
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