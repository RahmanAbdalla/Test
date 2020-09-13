package com.cybertek.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelReader {

    public static void main(String[] args) throws Exception {

        File file = new File("src/SampleData.xlsx");


            //Load the file into the java memory using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(file);

            //Load the excel workbook  into the java class
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);


            // workbook > sheet > row > cell

            //getting the sheet from the workbook
            XSSFSheet sheet = workbook.getSheet("Employees");

            //How to get Mohammed
            System.out.println(sheet.getRow(1).getCell(1)); //Abdalla


        //getPhysicalNumberOfRows() method will return the number of used rows only
        //if there are any rows which are not used, they are not counted'
        //starts form 1
        int usedRows = sheet.getPhysicalNumberOfRows();
       // System.out.println(usedRows);


        //getLastRowNum() method counts from top to bottom
        //does not care if empty cell or used cell
        //this starts from 0
        int lastUsedRow = sheet.getLastRowNum();
       // System.out.println(lastUsedRow);

        //TODO 1- Create a logic that prints out NEENA's name Dynamically

        for (int rowNum =0; rowNum < usedRows; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Neena")){
                System.out.println("Name is: "+sheet.getRow(rowNum).getCell(0));
            }
        }

        //TODO 1- Create a logic that prints out ADAM's lastName Dynamically

        for (int rowNum =0; rowNum < usedRows; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Adam")){
                System.out.println("Adam's last name is: "+sheet.getRow(rowNum).getCell(1));
            }
        }

        //TODO 1- Create a logic that prints out STEVEN's JobID Dynamically

        for (int rowNum =0; rowNum < usedRows; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Steve")){
                System.out.println("Steve's job ID is: "+sheet.getRow(rowNum).getCell(2));
            }
        }
    }
}
