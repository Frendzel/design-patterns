package pl.sda.model;

import java.time.Year;

public abstract class Car implements Driveable, Cloneable {

    private int door;
    private String color;
    private Year productionYear;

    public Car(int door, String color, Year productionYear) {
        this.door = door;
        this.color = color;
        this.productionYear = productionYear;
    }

    public int getDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }

    public Year getProductionYear() {
        return productionYear;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
