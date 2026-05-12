package com.pluralsight;

import java.util.Random;

public class SuperVillain extends Person{

    public SuperVillain(String name, int health, int evilnessLevel) {
        super(name, health, evilnessLevel);
    }

    public int getEvilnessLevel() {
        return this.getExperiencePoints();
    }

    @Override
    public void fight(Person opponent) {
        //Generate a random number to figure out the base damage being dealt
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101); // Gives a random number between 0-100

        //Base damage plus experience points for final damage
        int damage = baseDamage + this.getEvilnessLevel();

        //Figure out how we want to deal that damage to the opponent
        if (damage == 0) {
            System.out.println(this.name + " throws poison but missed the attack!\n");
        } else {
            System.out.println(this.name + " threw poison and dealt " + damage + " damage!\n");
            opponent.takeDamage(damage);
        }
    }
}
