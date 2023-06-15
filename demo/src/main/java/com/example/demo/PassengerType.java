package com.example.demo;

public class PassengerType {
    private String name;
    private double discount;
    private boolean freeActivities;

    public PassengerType(String name, double discount, boolean freeActivities) {
        this.name = name;
        this.discount = discount;
        this.freeActivities = freeActivities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isFreeActivities() {
        return freeActivities;
    }

    public void setFreeActivities(boolean freeActivities) {
        this.freeActivities = freeActivities;
    }
}
