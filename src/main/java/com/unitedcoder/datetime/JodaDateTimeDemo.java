package com.unitedcoder.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.util.Set;

public class JodaDateTimeDemo {
    public static void main(String[] args) {
        DateTime time=new DateTime();
        System.out.println(time);
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-hh-mm-SS");
        System.out.println(time.toString(formatter));

        DateTime universalTime=new DateTime(DateTimeZone.UTC);
        System.out.println(universalTime);
        DateTime istanbulTime=new DateTime(DateTimeZone.forID("Europe/Istanbul"));
        System.out.println(istanbulTime);
        Set<String> timeZone= ZoneId.getAvailableZoneIds();
        //for (String z:timeZone){
           // System.out.println(z);
        //}
        System.out.println(universalTime.getDayOfMonth());
        System.out.println(universalTime.getDayOfYear());
    }
}
