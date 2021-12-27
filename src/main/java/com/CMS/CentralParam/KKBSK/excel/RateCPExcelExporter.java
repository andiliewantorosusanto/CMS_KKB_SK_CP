package com.CMS.CentralParam.KKBSK.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.CMS.CentralParam.KKBSK.view.vwRateCP;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RateCPExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<vwRateCP> listRateCP;
     
    public RateCPExcelExporter(List<vwRateCP> listRateCP) {
        this.listRateCP = listRateCP;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("RateCP");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        int rowCount = 0;
        createCell(row, rowCount++, "Skema", style);      
        createCell(row, rowCount++, "Tipe Konsumen", style);       
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
                 
        for (vwRateCP rateCP : listRateCP) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, rateCP.getNamaSkema(), style);
            createCell(row, columnCount++, rateCP.getTipeKonsumenName(), style);
            createCell(row, columnCount++, rateCP.getTenor1().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor2().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor3().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor4().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor5().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor6().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor7().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor8().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor9().toString(), style);
            createCell(row, columnCount++, rateCP.getTenor10().toString(), style);
            createCell(row, columnCount++, rateCP.getStartBerlaku().toString(), style);
            createCell(row, columnCount++, rateCP.getEndBerlaku().toString(), style);
             
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