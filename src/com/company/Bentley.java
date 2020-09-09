package com.company;

public class Bentley extends Car {
    public BentleyType model;


    public Bentley(BentleyType model, Color color,double volume){
        super(volume,color);
        this.model=model;
    }


    public BentleyType getModel(){
        return  model;
    }

    @Override
    public String toString() {
        return "Bentley{" +
                "model='" + model + '\'' +super.toString()+
                '}';
    }
}
