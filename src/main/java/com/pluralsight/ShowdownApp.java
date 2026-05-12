package com.pluralsight;

import java.util.ArrayList;

public class ShowdownApp {

    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    private static final String reset = "\u001B[0m";

    public static void main(String[] args) {

        //Create list to hold our people
        ArrayList<Person> myPeople = new ArrayList<>();

        Person somePerson = new Person("Chris", 150, 100);
        Superhero someSuperhero = new Superhero("Super Chris", 250, 65);
        SuperVillain someVillain = new SuperVillain("Evil Lovi", 300, 65);

        myPeople.add(someVillain);
        myPeople.add(somePerson);
        myPeople.add(someSuperhero);

        for (Person person : myPeople) {

            //For checking an instance of a specific class
            if (person instanceof Superhero) {
                Superhero theHero = (Superhero) person;
                System.out.println("This was a superhero with " + theHero.getPowerLevel() + " power.");
            }
            if (person instanceof SuperVillain) {
                SuperVillain theVillian = (SuperVillain) person;
                System.out.println("This was a villain with " + theVillian.getEvilnessLevel() + " evilness");
            }
        }
        System.out.println("\nThe standoff before the fight...");
        System.out.println(someSuperhero.getStatus());
        System.out.println(someVillain.getStatus() + "\n");

        while(someSuperhero.isAlive() && someVillain.isAlive()) {

            someSuperhero.fight(someVillain);
            System.out.println(someSuperhero.getStatus());
            System.out.println(someVillain.getStatus() + "\n");

            if (!someVillain.isAlive()) {
                break;
            }

            someVillain.fight(someSuperhero);
            System.out.println(someSuperhero.getStatus());
            System.out.println(someVillain.getStatus() + "\n");

        }
        if (someSuperhero.isAlive()) {
            System.out.println(BLUE + someSuperhero.getName() + reset + " has defeated " + RED + someVillain.getName() + reset + " with " + GREEN + someSuperhero.getHealth() + reset + " health left!");
        } else {
            System.out.println(RED + someVillain.getName() + reset + " has defeated " + BLUE + someSuperhero.getName() + reset + " with " + GREEN + someVillain.getHealth() + reset + " health left!");
        }

//        System.out.println(somePerson.getStatus());
//        System.out.println(someSuperhero.getStatus());
//        System.out.println(someVillain.getStatus() + "\n");
//
//        System.out.println(someVillain.getName() + " has been attacked.");
//        someVillain.takeDamage(75);
//        System.out.println(someVillain.getHealth());
//
//        System.out.println("\nThis villain has this much evilness: " + someVillain.getEvilnessLevel() + "\n");
//
//        someSuperhero.fight(someVillain);
//        someVillain.fight(someSuperhero);
//        someVillain.fight(somePerson);
//
//        System.out.println(somePerson.getStatus());
//        System.out.println(someSuperhero.getStatus());
//        System.out.println(someVillain.getStatus() + "\n");

    }
}
