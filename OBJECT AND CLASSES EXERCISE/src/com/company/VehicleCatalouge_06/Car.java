package com.company.VehicleCatalouge_06;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsepower;


    public Car(String model, String color, int horsepower) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.type = "Car";
    }


    public String getModel() {
        return this.model;
    }


    public double getHorsePower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                        "Model: %s%n" +
                        "Color: %s%n" +
                        "Horsepower: %d".trim(),
                this.type, this.model, this.color, this.horsepower);
    }
}
