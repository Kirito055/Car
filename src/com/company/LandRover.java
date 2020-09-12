package com.company;

public class LandRover extends Car{
    public LandRoverType model;



     LandRover(String model, Color color, double volume){
        super(volume,color);
        this.model= LandRoverType.valueOf(model);

    }
    public LandRoverType getModel(){
        return  model;
    }

    @Override
    public String toString() {
        return "LandRover{" +
                "model='" + model + '\'' +super.toString()+
                '}';
    }
}
