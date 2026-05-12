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
            System.out.println(BLUE + this.name + reset + " missed the attack!\n");
        } else {
            System.out.println(BLUE + this.name + reset + " threw a super punch and dealt " + bold + RED + damage + reset + " damage to " + RED + opponent.getName() + reset + "\n");
            opponent.takeDamage(damage);
        }
    }

    //Needed a custom status for hero and villain colors
    @Override
    public String getStatus() {
        //Ternary op for the color of health
        String colorOfHP = (this.health > 0) ? GREEN : RED;
        return BLUE + this.name + reset + " has " + colorOfHP + this.health + reset + " health";
    }
}
