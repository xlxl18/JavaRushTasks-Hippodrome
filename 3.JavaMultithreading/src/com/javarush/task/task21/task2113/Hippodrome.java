package com.javarush.task.task21.task2113;
import java.util.*;
public class Hippodrome {
    public static Hippodrome game;
    public static List<Horse> horses=new ArrayList<Horse>();
    public List<Horse> getHorses() {
        return this.horses;
    }
    public Hippodrome(List<Horse> horses) {
        this.horses=horses;
    }

    public void move() {
        horses.get(0).move();
        horses.get(1).move();
        horses.get(2).move();
    }

    public void print() {
        for(Horse horse: horses) {
            horse.print();
        }
        for(int i=0;i<10;i++) {
            System.out.println();
        }
    }

    public void run() {
        for(int i=0;i<100;i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        game = new Hippodrome(horses);
        Horse horse1 = new Horse("Филипп",3,0);
        Horse horse2 = new Horse("Фредерик",3,0);
        Horse horse3 = new Horse("Барсук",3,0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game.run();
    }
}
