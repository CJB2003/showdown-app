package com.pluralsight;

public class Person{

    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String reset = "\u001B[0m";
    public static final String bold = "\u001B[1m";

    //Protected
    protected String name;
    protected int health;
    protected int experiencePoints;

    public Person(String name, int health, int experiencePoints) {
        this.name = name;
        this.health = health;
        this.experiencePoints = experiencePoints;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getStatus() {
        return this.name + " has " + this.health + " health.";
    }

    public void takeDamage(int damage) {
        //reduce the health by the amount of damage
        this.health -= damage;
        if (this.health < 0) {
            health = 0;
        }

    }

    public void fight(Person opponent) {

        System.out.println(this.name + " prepares to fight " + opponent.getName() + "\n");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
