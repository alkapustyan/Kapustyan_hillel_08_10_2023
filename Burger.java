package ua.vodafone.homework;

public class Burger {
    Boolean bun;
    Boolean meat;
    Boolean cheese;
    Boolean greenery;
    Boolean mayonnaise;

    public Burger() {
        this.bun = true;
        this.meat = true;
        this.cheese = true;
        this.greenery = true;
        this.mayonnaise = true;

        System.out.println("Standard burger with bun, meat, cheese, greenery and mayonnaise.");
    }

    public Burger(Boolean bun, Boolean meat, Boolean cheese, Boolean greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = false;

        System.out.println("Diet burger with bun, meat, cheese, greenery and without mayonnaise.");
    }

    public Burger(Boolean bun, Boolean doubleMeat, Boolean cheese, Boolean greenery, Boolean mayonnaise) {
        this.bun = bun;
        this.meat = doubleMeat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Double burger with bun, double meat, cheese, greenery and mayonnaise.");
    }
}
