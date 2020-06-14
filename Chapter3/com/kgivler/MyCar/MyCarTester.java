package com.kgivler.MyCar;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MyCarTester {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Tank Capacity: ");
        double cap = in.nextDouble();
        System.out.print("Miles Per Gallon: ");
        double mpg = in.nextDouble();

        MyCar car = new MyCar(mpg, cap);
        car.addGas(cap);

        int milesTraveled= 0;

        while(car.drive(1))
            milesTraveled++;

        DecimalFormat df = new DecimalFormat("####0.0000");
        System.out.println("The car travled " + milesTraveled + " miles and has: " + df.format(car.gasLeft()) + " gallons of gas remaining.");

        in.close();
    }
}