package org.example.Seleniumpractice;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo34 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\amrit\\IdeaProjects\\SeleniumProject\\testData\\Book details.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        //Note --> row the index starts from 4 (Last rowNum=4 means it has total 5 rows)
        int total_row=sheet.getLastRowNum();
        System.out.println(total_row);
        //Note --> Here the size is equal to 4 but indexing starts from 0
        int total_Coloumns =sheet.getRow(0).getLastCellNum();
        System.out.println(total_Coloumns);
        for(int r=0;r<=total_row;r++){
            for(int c=0;c<total_Coloumns;c++){
                XSSFCell Value=sheet.getRow(r).getCell(c);
                System.out.print(Value.toString()+" ");
            }
            System.out.println();
        }
workbook.close();
        fis.close();
    }
}
