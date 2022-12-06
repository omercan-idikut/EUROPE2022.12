package com.unitedcoder.exceltutorial;

import com.unitedcoder.oopsconcept.inheritancetutorial.BaseClass;

import java.util.List;

public class MultipleRolesTest extends BaseClass {
    public static void main(String[] args) {
        openBrowser();
        String fileName="testdatafolders/myDoc.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        List<LogInfo> users=excelUtility.readFromMutipleCell(fileName,"LoginInfo");
        for (LogInfo user:users){
            logIn(user.getUserName(),user.getPassword());
            logOut();
        }
        closeBrowser();

    }
}
