package com.lambdaschool;

import java.util.ArrayList;

public class Main
{
    public static void printAnimals(ArrayList<Animal> animalList, Functions tester)
    {
        for (Animal a : animalList)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Animal> allAnimals = new ArrayList<Animal>();
        // Mammals
        allAnimals.add(new Mammal("Panda", 1869));
        allAnimals.add(new Mammal("Zebra", 1778));
        allAnimals.add(new Mammal("Koala", 1816));
        allAnimals.add(new Mammal("Sloth", 1804));
        allAnimals.add(new Mammal("Armadillo", 1758));
        allAnimals.add(new Mammal("Raccoon", 1758));
        allAnimals.add(new Mammal("Bigfoot", 2021));
        // Birds
        allAnimals.add(new Bird("Pigeon", 1837));
        allAnimals.add(new Bird("Peacock", 1821));
        allAnimals.add(new Bird("Toucan", 1758));
        allAnimals.add(new Bird("Parrot", 1824));
        allAnimals.add(new Bird("Swan", 1758));
        // Fish
        allAnimals.add(new Fish("Salmon", 1758));
        allAnimals.add(new Fish("Catfish", 1817));
        allAnimals.add(new Fish("Perch", 1758));

        // List all animals in descending order by year named
        System.out.println("*** Descending year named ***");
        allAnimals.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        allAnimals.forEach((a1) -> System.out.println(a1.getYearDiscovered()));

        // List all the animals alphabetically
        System.out.println("\n*** Alphabetically ***");
        allAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        allAnimals.forEach((a1) -> System.out.println(a1.getName()));

        // List all animals order by how they move
        System.out.println("\n*** By movement***");
        allAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        allAnimals.forEach((a1) -> System.out.println(a1.getName() + " " + a1.move()));

        // List only the animals with lungs
        System.out.println("\n*** Animals with Lungs***");
        printAnimals(allAnimals, a -> a.breath() == "Lungs");

        // List only those animals that breath with lunch and were named in 1758
        System.out.println("\n*** Animals with Lungs Named in 1758***");
        printAnimals(allAnimals, a -> (a.breath() == "Lungs") && (a.getYearDiscovered() == 1758));

        // List only those animals that lay eggs and breath with lungs
        System.out.println("\n*** Eggs and Lungs ***");
        printAnimals(allAnimals, a ->((a.breath() == "Lungs") && (a.reproduce() == "Eggs")));

        // List alphabetically only animals named in 1758
        System.out.println("\n*** Named in 1758 alphabetically ***");
        allAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(allAnimals, a -> (a.getYearDiscovered() == 1758));


    }
}
