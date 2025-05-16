package org.example.Seleniumpractice;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo35 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\amrit\\IdeaProjects\\SeleniumProject\\testData\\Flight details.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sheet1");
        XSSFRow row= sheet.createRow(0);

        row.createCell(0).setCellValue("From");
        row.createCell(1).setCellValue("Destination");
        row.createCell(2).setCellValue("starttime");
        row.createCell(3).setCellValue("endtime");
        XSSFRow row1= sheet.createRow(1);
        row1.createCell(0).setCellValue("Delhi");
        row1.createCell(1).setCellValue("Bangalore");
        row1.createCell(2).setCellValue("9:30");
        row1.createCell(3).setCellValue("12:30");

        workbook.write(fos);


    }
}
