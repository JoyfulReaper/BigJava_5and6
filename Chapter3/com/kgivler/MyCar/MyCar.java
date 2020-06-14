package com.kgivler.MyCar;

public class MyCar {
    private double milesPerGallon;
    private double gallonsOfGas;
    private double tankCapacity;

    MyCar(double mpg)
    {
        this(mpg, 10);
    }

    /**
     * Construct a new MyCar
     * @param mpg Miles per gallon
     */
    public MyCar (double mpg, double tankCapacity)
    {
        milesPerGallon = mpg;
        gallonsOfGas = 0;
        this.tankCapacity = tankCapacity;
    }

    /**
     * Add fuel to the car
     * @param gallons Number of gallons to add
     */
    public Boolean addGas(double gallons)
    {
        if(gallons + gallonsOfGas > tankCapacity || gallons < 0)
            return false;

        gallonsOfGas += gallons;
        return true;
    }


    /**
     * Drive a certain number of miles.
     * @param miles The miles to drive
     */
    public Boolean drive(double miles)
    {
        if(miles / milesPerGallon > gallonsOfGas || miles < 0)
            return false;

        gallonsOfGas -= miles / milesPerGallon;
        return true;
    }

    /**
     * Get the number of gallons of gas remaining.
     * @return Gallons of gas in the tank
     */
    public double gasLeft()
    {
        return gallonsOfGas;
    }

}