package com.lambdaschool;

public class Bird extends Animal
{
    // Constructor
    public Bird(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    // Implement methods
    @Override
    public String move()
    {
        return "Fly";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }
}
