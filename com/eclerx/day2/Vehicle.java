package com.eclerx.day2;

public abstract class Vehicle extends Object implements Accessories, Battery {
    int maxSpeed;
    String color;
    public Vehicle(int maxSpeed) {
        super();
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(int maxSpeed, String color) {
        // super();
        // this.maxSpeed = maxSpeed;
        this(maxSpeed);
        this.color = color;
    }

    public void speedUp(){
        maxSpeed++;
    }

    public abstract void shiftGear();
}
