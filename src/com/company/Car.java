package com.company;

public abstract class Car {
    private double volume;
    private Color color;


    public  Car(double volume,Color  color){
        this.color = color;
        this.volume = volume;
    }
    Car(){

    }
    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return  " volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
}
