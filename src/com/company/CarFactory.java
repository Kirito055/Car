package com.company;

public class CarFactory {
    public static Car buildCar(String marka,String model,Color color, double volume) {
        Car car = null;
        switch (marka) {
            case "Bentley":
                car = new Bentley(model,color,volume);
                break;

            case "LandRover":
                car = new LandRover(model,color,volume);
                break;

            default:

                break;
        }
        return car;
    }
}