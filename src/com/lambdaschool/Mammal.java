package com.lambdaschool;

public class Mammal extends Animal
{
    // Constructor
    public Mammal(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    // Implement methods

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live births";
    }
}
