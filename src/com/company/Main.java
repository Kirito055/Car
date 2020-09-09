package com.company;

public class    Main {

    public static void main(String[] args) {
        {
            CarBuilder builder = new CarBuilder();
            System.out.println( builder.buildBentley(BentleyType.CULLINAN,Color.BLUE,6));
            System.out.println( builder.buildLandRover(LandRoverType.DISCOVERY,Color.BROWN,3));

            System.out.println( builder.buildLandRover(LandRoverType.RANGROVER,Color.BLUE,5));
        }
    }
}
