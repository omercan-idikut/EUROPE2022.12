package com.unitedcoder.exceltutorial;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

public class ExcellWriteDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        List<String > content=new ArrayList<>();
        content.add("test-name,test-module,tets-status,executedAt,executedBy");
        content.add("Login,Login,Passed,"+getCurrentDateTime()+","+getAdminName());
        content.add("Add_Customer,Customer,Passed,"+getCurrentDateTime()+","+getAdminName());
        content.add("Add_Product,Inventory,Passed"+getCurrentDateTime()+","+getAdminName());
        String fileName="testdatafolders/testReport.xlsx";
        excelUtility.writeToExcells(fileName,"Test-Report",content);
    }
    public static String getCurrentDateTime(){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd");
        return dateTime.toString(formatter);
    }
    public static String getAdminName(){
        String user=System.getProperty("user.name");
        return user;
    }
}
