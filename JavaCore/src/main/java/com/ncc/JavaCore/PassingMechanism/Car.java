package com.ncc.JavaCore.PassingMechanism;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
class PassbyValueWithObj {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2023);
        changerCar(car);
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
    public static void changerCar(Car car){
        car.setModel("honda");
        car.setYear(2002);
    }
}