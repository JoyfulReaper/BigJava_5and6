package com.kgivler.RoachPopulation;

public class RoachPopulation {
    private int population;

    /**
     * Create a new roach population with the given initial population.
     * @param population The initial population size.
     */
    public RoachPopulation(int population)
    {
        this.population = population;
    }

    /**
     * Doubles the roach population.
     */
    public void breed()
    {
        population *= 2;
    }

    /**
     * Kills off 10% of the roach population.
     */
    public void spray()
    {
        population -= .1 * population;
    }

    /**
     * Get the number of roaches in the population.
     * @return Number of roaches
     */
    public int getRoaches()
    {
        return population;
    }
}