package com.javarush.task.task21.task2113;

public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name=name;
        this.speed=speed;
        this.distance=distance;
    }
    public String getName() {
        return this.name;
    }

    public void move() {
        distance+=speed*Math.random();
    }
    public void print() {
        int distance = (int)Math.floor(this.distance);
        String dots="";
        for(int i=0;i<distance;i++) {
            dots+=".";
        }
        System.out.println(dots+this.name);
    }
    public void setName(String name) {
        this.name=name;
    }
    public double getSpeed() {
        return this.speed;
    }
    public void setSpeed(double speed) {
        this.speed=speed;
    }
    public double getDistance() {
        return this.distance;
    }
    public void setDistance(double distance) {
        this.distance=distance;
    }
}
