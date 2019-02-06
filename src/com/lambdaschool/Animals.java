package com.lambdaschool;

public abstract class Animals
{
    // unique number, name, and year discovered
    private static int maxId = 0;
    int id;
    String name;
    int yearDiscovered;

    // constructor
    public Animals(String name, int yearDiscovered)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // consume food the same way
    public String consumeFood()
    {
        return "Mouth";
    }

    // methods return String for move, breath, reproduce
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();


}
