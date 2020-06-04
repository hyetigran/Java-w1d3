package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Day 3");
        System.out.println("\nHorse Interfaces");

        Horse seabiscuit = new Horse("Sea");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        joe.eat(20);
        seabiscuit.move();
        seabiscuit.move();
        seabiscuit.move();
        System.out.println(seabiscuit.getFuelLevel());

        System.out.println("\n Vehicle Abstract");
        Donkey don = new Donkey("Don", 10);
        don.addFuel(10);
        Donkey john = new Donkey("John");
        john.move(10);

        Auto vw = new Auto(1, "EuroVan", 2000);
        Auto toyota = new Auto(1, "Tundra", 2020);
        vw.move();
        vw.move(5);

        List<AbstractVehicle> myList = new ArrayList<>();
        myList.add(don);
        myList.add(vw);
        myList.add(john);
        myList.add(toyota);

        System.out.println("\n List");
        System.out.println(myList.toString());
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v));

    }
}
