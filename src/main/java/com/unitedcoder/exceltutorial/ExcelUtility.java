package com.unitedcoder.exceltutorial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;


public class ExcelUtility {

    //method to read from excel cell
    public String readFromExcellCell(String fileName,String sheetName,int rowNumber,int cellNumber){
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        XSSFRow row=sheet.getRow(rowNumber);
        String cellValue=null;
        if(row==null){
            System.out.println("Empty row!!!");
        }else {
            XSSFCell cell=row.getCell(cellNumber);
            CellType cellType=cell.getCellType();
            switch (cellType){
                case NUMERIC:
                    cellValue=String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;
            }
        }
        return cellValue;
    }
    public List<LogInfo> readFromMutipleCell(String fileName,String sheetName) {;
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        List<LogInfo> loginUsers=new ArrayList<>();
        int rowCount=sheet.getLastRowNum();
        for(int r=1;r<=rowCount;r++){
            XSSFRow row=sheet.getRow(r);
            XSSFCell userName=row.getCell(0);
            XSSFCell password=row.getCell(1);
            LogInfo logInfo=new LogInfo(userName.getStringCellValue(),password.getStringCellValue());
            loginUsers.add(logInfo);
        }
        return loginUsers;
    }

    public void writeToExcells(String fileName,String sheetName,List<String> content){
        //define a file ti erite
        File excelFile=new File(fileName);
        //define a worrk book
        XSSFWorkbook workbook=new XSSFWorkbook();
        //create sheet
        XSSFSheet sheet=workbook.createSheet(sheetName);
        int numberOfRows=content.size();
        for (int rowNumber=0;rowNumber<numberOfRows;rowNumber++){
            XSSFRow row=sheet.createRow(rowNumber);
            String[] rowContent=content.get(rowNumber).split(",");
            int totalcell=rowContent.length;
            for (int cellNumber=0;cellNumber<totalcell;cellNumber++){
                XSSFCell cell=row.createCell(cellNumber);
                //add contents to the cell
                cell.setCellValue(rowContent[cellNumber]);

            }
        }
        FileOutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream(excelFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}