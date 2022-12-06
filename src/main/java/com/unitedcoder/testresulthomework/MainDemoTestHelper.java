package com.unitedcoder.testresulthomework;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class MainDemoTestHelper {
    public static String getToday(){
        DateTime dateTime = new DateTime();
        org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        return  (dateTime.toString(formatter));
    }

    public static String getCurrentTime(){
        DateTime dateTime = new DateTime();
        org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("HH-mm-ss-SS");
        return  (dateTime.toString(formatter));
    }

    public static String getCurrentUer(){
        String currentUser = System.getProperty("user.name");
        return currentUser;
    }
}
