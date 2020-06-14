package com.kgivler.RoachPopulation;

import java.util.Scanner;

public class RoachPopulationTester {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Initial population size: ");
        RoachPopulation population = new RoachPopulation(in.nextInt());
        
        Boolean quit = false;
        while (!quit)
        {
            System.out.println("Roach Population: " + population.getRoaches() + "\n");
            System.out.println("\nMenu: ");
            System.out.println("1. Breed Roaches");
            System.out.println("2. Spray Roaches");
            System.out.println("3. Quit\n");

            System.out.print("Input: ");
            int choice = in.nextInt();

            switch (choice)
            {
                case 1:
                    population.breed();
                    break;
                case 2:
                    population.spray();
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    continue;
            }
        }

        in.close();
    }
}