package com.spring;

public class Car {
    private String brand;
    private String color;
    private String parameter;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getParameter() {
        return parameter;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Car() {
    }

    public Car(String brand, String color, String parameter) {
        this.brand = brand;
        this.color = color;
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", parameter='" + parameter + '\'' +
                '}';
    }
}
