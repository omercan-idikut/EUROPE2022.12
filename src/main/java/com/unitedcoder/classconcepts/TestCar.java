package com.unitedcoder.classconcepts;

import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.setBrand("Toyota");
        toyota.setMade("Japan");
        toyota.setColor("White");
        toyota.setYear(2022);
        toyota.setPrice(35000);
        toyota.setMileAge(1000);
        toyota.setEnginetype("2.0");

        System.out.println(toyota.toString());

        Car honda = new Car();
        honda.setBrand("Honda");
        honda.setMade("Japan");
        honda.setColor("Blue");
        honda.setYear(2022);
        honda.setPrice(45000);
        honda.setMileAge(2000);

        Car benz = new Car();
        benz.setBrand("Benz");
        benz.setMade("Germany");
        benz.setColor("Black");
        benz.setYear(2022);
        benz.setPrice(55000);
        benz.setMileAge(3000);

        System.out.println(toyota.getYear());
        System.out.println(benz.getMade());
        System.out.println(honda.getColor());
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(toyota);
        carList.add(honda);
        carList.add(benz);
        for (Car cars : carList) {
            if (cars.getBrand().equalsIgnoreCase("honda")) {
                System.out.println(String.format("%s %s %s %d %d %d",
                        cars.getBrand(),
                        cars.getColor(),
                        cars.getMade(),
                        cars.getYear(),
                        cars.getPrice(),
                        cars.getMileAge()));
            }
        }
    }
}