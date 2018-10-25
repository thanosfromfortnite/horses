package com.company;

public class CoolerHorse implements Horse {
    private String name; private int weight;

    public CoolerHorse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }

}
