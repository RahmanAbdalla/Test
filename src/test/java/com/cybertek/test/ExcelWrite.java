package com.cybertek.test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {

    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "src/SampleData.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook > sheet < row > cell
        //loading excel workbook into class
        workbook = new XSSFWorkbook(fileInputStream);

        //get our sheet
        sheet = workbook.getSheet("Employees");

        //Kings's row
        row = sheet.getRow(1);

        //kings cell
        cell = row.getCell(1);

        //storing adam's name cell if you're frequently using it
        XSSFCell adamsCell = sheet.getRow(2).getCell(0);
        System.out.println("Before: "+adamsCell);

        adamsCell.setCellValue("Madam");

        System.out.println("After: "+adamsCell);

        //create a fileOutputStream to specify which file we are writing to
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();

    }
}
