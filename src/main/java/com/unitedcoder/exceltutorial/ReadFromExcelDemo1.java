package com.unitedcoder.exceltutorial;

import java.util.List;

public class ReadFromExcelDemo1 {
    public static void main(String[] args) {
        String fileName="testdatafolders/myDoc.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        String userName=excelUtility.readFromExcellCell(fileName,"LoginInfo",1,0);
        String password=excelUtility.readFromExcellCell(fileName,"LoginInfo",1,1);
        List<LogInfo> users=excelUtility.readFromMutipleCell(fileName,"LoginInfo");
        System.out.println(users);

    }
}
