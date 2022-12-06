package com.unitedcoder.loops;

public class StringDemo2 {
  public static void main(String[] args) {
    //String index and length
    String city = "Amsterdam";
    String country = "Netherland";
    String course = "Java selenium Test Automation";
    String space = "";
    int l = city.length();
    System.out.println(l);
    int i1 = country.indexOf("a");
    System.out.println(i1);
    System.out.println("Index of first e:" + country.indexOf("e"));
    System.out.println("index of last e:"+country.lastIndexOf("e"));
    System.out.println(course.indexOf("Test"));
    System.out.println(space.length());

    //upper case lower case---Java case-sensitive
    System.out.println(city.toUpperCase());
    System.out.println(course.toLowerCase());
    //replace
    course = course.replace("Java", "Python");
    System.out.println(course);
    String date= "03-09-2022";//03/09/2022 2022-09-03
    date=date.replace("-","/");
    System.out.println(date);
    date=date.replace("-",".");
    System.out.println(date);
    System.out.println(date);
    //15,000  25900,876
    String value="2345,9876";//2345.9876
    value=value.replace(",",".").replace(" ","");
    System.out.println(value);
    String result="About 18.760.000.000 result";
    //result=result.replace(About",").replace(result",").trim()
    System.out.println(result);
    //Sub string
    System.out.println(result.substring(5,10));//include begin index,exclude end index
    System.out.println(result.substring(6,20));
    //compare to String
    String s1="Jvava";
    String s2="java";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    //String concatenation
    int i3=100;
    int i2=200;
    System.out.println(i3+i2);//300
    String v1="100";
    String v2="200;";
    String v3="Hello";
    String v4="World";
    System.out.println(v3+v4);
    System.out.println(v1+v2);





  }



  }












