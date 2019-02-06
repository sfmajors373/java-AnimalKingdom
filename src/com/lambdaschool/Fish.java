package com.lambdaschool;

public class Fish extends Animal
{
    // Constructor

    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    // Implement methods

    @Override
    public String move()
    {
        return "Swim";
    }

    @Override
    public String breath()
    {
        return "Gills";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }
}
