package com.pluralsight;

import java.util.Random;

public class Superhero extends Person{


    public Superhero(String name, int health, int powerLevel) {

        super(name, health, powerLevel);
    }

    public int getPowerLevel() {
        return this.experiencePoints;
    }

    @Override
    public void fight(Person opponent) {
        //Generate a random number to figure out the base damage being dealt
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101); // Gives a random number between 0-100

        //Base damage plus experience points for final damage
        int damage = baseDamage + this.getPowerLevel();

        //Figure out how we want to deal that damage to the opponent
        if (damage == 0) {
            System.out.println(this.name + " missed the attack!\n");
        } else {
            System.out.println(this.name + " threw a super punch and dealt " + damage + " damage!\n");
            opponent.takeDamage(damage);
        }
    }
}
