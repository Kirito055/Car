package com.company;

public class LandRover extends Car{
    public LandRoverType model;



    public LandRover(LandRoverType model, Color color, double volume){
        super(volume,color);
        this.model=model;

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
