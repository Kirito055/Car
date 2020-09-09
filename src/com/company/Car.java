package com.company;

public abstract class Car {
    public double volume;
    public Color color;


    public  Car(double volume,Color  color){
        this.color = color;
        this.volume = volume;
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
