package com.company;

import java.util.Scanner;

public class    Main {

    public static void main(String[] args) {
        {
            CarFactory car=new CarFactory();
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose car brand: 'LandRover' or 'Bentley';");
            String marka = sc.nextLine();
            System.out.println("Please write model");
            String model=sc.nextLine();
            System.out.println("Please write color");
            Color color = Color.valueOf(sc.nextLine());
            System.out.println("Please write volume");
            Double volume = sc.nextDouble();
            System.out.println(car.buildCar(marka,model,color,volume));

        }
    }
}
