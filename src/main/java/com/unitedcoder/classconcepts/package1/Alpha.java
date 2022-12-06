package com.unitedcoder.classconcepts.package1;

public class Alpha {
    public static void main(String[] args) {
        Alpha alpha=new Alpha();
        alpha.alphaInfo="info";


    }
    private String alphaInfo;
    public String alphaVersion;

    protected int age;
    protected void getAge(){
        System.out.println(age);
    }

    int year;
    void getYear(){
        System.out.println(year);
    }

    public Alpha() {
    }

    public Alpha(String alphaInfo) {
        this.alphaInfo = alphaInfo;
    }

    public String getAlphaInfo() {
        return alphaInfo;
    }


    private void setAlphaInfo(String alphaInfo) {
        this.alphaInfo = alphaInfo;
    }
    public void set(String alphaInfo){
        setAlphaInfo(alphaInfo);
    }
}
