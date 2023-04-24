package com.ncc.Springboot.SpringBean;

public class PojoExample {
    String name;
    public String role;
    private double salary;

    public PojoExample(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public String getRole() {
        return role;
    }


    public double getSalary() {
        return salary;
    }

}
