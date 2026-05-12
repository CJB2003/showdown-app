package com.pluralsight;

import java.util.ArrayList;

public class ShowdownApp {
    public static void main(String[] args) {

        //Create list to hold our people
        ArrayList<Person> myPeople = new ArrayList<>();

        Person somePerson = new Person("Chris", 150, 100);
        Superhero someSuperhero = new Superhero("Super Chris", 200, 50);
        SuperVillain someVillain = new SuperVillain("Evil Lovi", 250, 65);

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

        System.out.println(somePerson.getStatus());
        System.out.println(someSuperhero.getStatus());
        System.out.println(someVillain.getStatus() + "\n");

        System.out.println(someVillain.getName() + " has been attacked.");
        someVillain.takeDamage(75);
        System.out.println(someVillain.getHealth());

        System.out.println("\nThis villain has this much evilness: " + someVillain.getEvilnessLevel() + "\n");

        someSuperhero.fight(someVillain);
        someVillain.fight(someSuperhero);
        someVillain.fight(somePerson);

        System.out.println(somePerson.getStatus());
        System.out.println(someSuperhero.getStatus());
        System.out.println(someVillain.getStatus() + "\n");

    }
}
