package com.lambdaschool;

public abstract class Animal
{
    // unique number, name and year discovered
    private static int maxId = 0;
    int id;
    String name;
    int yearDiscovered;

    // Constructor

    public Animal(String name, int yearDiscovered)
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

    // getters and setters

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered)
    {
        this.yearDiscovered = yearDiscovered;
    }

    public int getId()
    {
        return id;
    }

    // Make a better toString

    @Override
    public String toString()
    {
        return "Animals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                '}';
    }
}
