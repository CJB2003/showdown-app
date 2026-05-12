package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {

        Person somePerson = new Person("Chris", 150, 100);
        Superhero someSuperhero = new Superhero("Super Chris", 200, 50);
        SuperVillain someVillain = new SuperVillain("Evil Lovi", 250, 65);

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
