package cn.ksdshpx.poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.extractor.ExcelExtractor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.extractor.XSSFExcelExtractor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2018/1/15
 * Time: 21:07
 * Description:测试POI导出Excel
 */
public class POIDemo {
    @Test
    public void test() throws Exception {
        //创建工作簿
        Workbook workbook = new HSSFWorkbook();
        OutputStream outputStream = new FileOutputStream("e:\\新创建的工作簿.xls");
        workbook.write(outputStream);
        outputStream.close();
    }

    @Test
    public void test2() throws Exception {
        //创建工作簿
        Workbook workbook = new HSSFWorkbook();
        //创建Sheet页
        workbook.createSheet("第一个Sheet页");
        workbook.createSheet("第二个Sheet页");
        OutputStream outputStream = new FileOutputStream("e:\\新创建的工作簿.xls");
        workbook.write(outputStream);
        outputStream.close();
    }

    @Test
    public void test3() throws Exception {
        //创建工作簿
        Workbook workbook = new HSSFWorkbook();
        //创建Sheet页
        Sheet sheet = workbook.createSheet("第一个Sheet页");
        //创建row
        Row row = sheet.createRow(0);//创建第一行
        Cell cell = row.createCell(0);//创建第一行第一个单元格
        cell.setCellValue(1);//在第一行第一个单元格写入1
        row.createCell(1).setCellValue(1.2);
        row.createCell(2).setCellValue("工资");
        row.createCell(3).setCellValue(false);
        OutputStream outputStream = new FileOutputStream("e:\\新创建的工作簿.xls");
        workbook.write(outputStream);
        outputStream.close();
    }

    @Test
    public void test4() throws Exception {
        //创建工作簿
        Workbook workbook = new HSSFWorkbook();
        //创建Sheet页
        Sheet sheet = workbook.createSheet("第一个Sheet页");
        //创建row
        Row row = sheet.createRow(0);//创建第一行
        Cell cell = row.createCell(0);//创建第一行第一个单元格
        cell.setCellValue(new Date());//在第一行第一个单元格写入一个日期
        CreationHelper creationHelper = workbook.getCreationHelper();
        CellStyle cellStyle = workbook.createCellStyle();
        short format = creationHelper.createDataFormat().getFormat("yyyy-mm-dd hh:mm:ss");
        cellStyle.setDataFormat(format);
        cell = row.createCell(1);
        cell.setCellValue(new Date());
        cell.setCellStyle(cellStyle);
        OutputStream outputStream = new FileOutputStream("e:\\新创建的工作簿.xls");
        workbook.write(outputStream);
        outputStream.close();
    }

    @Test
    public void test5() throws Exception {
        //读取Excel的内容，并遍历之
        InputStream in = new FileInputStream("e:\\二货名单.xlsx");
        Workbook workbook = new XSSFWorkbook(in);
        Sheet sheet = workbook.getSheetAt(0);
        int lastRowNum = sheet.getLastRowNum();
        for (int rowNum = 0; rowNum < lastRowNum + 1; rowNum++) {
            for (int cellNum = 0; cellNum < sheet.getRow(rowNum).getLastCellNum(); cellNum++) {
                Cell cell = sheet.getRow(rowNum).getCell(cellNum);
                System.out.print(String.valueOf(generalCellPrint(cell) + " "));
            }
            System.out.println();
        }
    }

    private String generalCellPrint(Cell cell) {
        if (cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            return String.valueOf(cell.getStringCellValue());
        }
    }

    @Test
    public void test6() throws Exception{
        //读取Excel的内容，并遍历之
        InputStream in = new FileInputStream("e:\\二货名单.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        ExcelExtractor excelExtractor = new XSSFExcelExtractor(workbook);
        //excelExtractor.setIncludeSheetNames(false);
        System.out.println(excelExtractor.getText());
    }
}
