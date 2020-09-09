package com.company;

public class CarBuilder {
    Bentley bentley;
    LandRover landRover;
    public Object buildBentley(BentleyType name, Color color, double volume){
     Bentley   bentley=new Bentley(name,color,volume);

        return bentley;
    }

    public Object buildLandRover(LandRoverType name, Color color, double volume){
        landRover=new LandRover(name,color,volume);
        return landRover;
    }


}
