package com.unitedcoder.classconcepts;

public class TestCar1 {
    public static void main(String[] args) {
        //car array object
        Car[] cars=new Car[3];
        Car car1=new Car("BMW","Blue",45000,2022);
        Car car2=new Car("Ford","Black",35000,2020);
        Car car3=new Car("KIA","White",54000,2021);
        cars[0]=car1;
        cars[1]=car2;
        cars[2]=car3;

        for (Car c:cars){
           // System.out.println(c.toString());
            System.out.println(c.getBrand()+" "+c.getColor()+" " +c.getPrice()+" "+c.getYear());
            System.out.println();
        }
    }
}
