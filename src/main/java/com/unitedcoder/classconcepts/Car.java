package com.unitedcoder.classconcepts;

public class Car {
    //state behaviour
    //class level variable
    private String brand;//Honda Toyota
    private String made;
    private String color;
    private long mileAge;
    private long price;
    private long year;

    public Car() {  //Default constructor
    }

    public Car(String brand, String color, long price, long year) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.year = year;
    }
    public Car( String color, long price, long year) {
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String made, long mileAge, long price, long year) {
        this.made = made;
        this.mileAge = mileAge;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {//override
        return "Car{" +
                "brand='" + brand + '\'' +
                ", made='" + made + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileAge +
                ", price=" + price +
                ", year=" + year +
                ", car='" + car + '\'' +
                ", enginetype='" + enginetype + '\'' +
                '}';
    }

    public String car;
    public String getEnginetype() {
        return enginetype;
    }
    public String carInfo(){
        return brand+", "+made+", "+color+", "+price+", "+year+", ";
    }
    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    private String enginetype;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMileAge() {
        return mileAge;
    }

    public void setMileAge(long mileAge) {
        this.mileAge = mileAge;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }
}
