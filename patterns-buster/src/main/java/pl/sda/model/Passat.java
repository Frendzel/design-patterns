package pl.sda.model;

import lombok.Builder;

import java.time.Year;

@Builder
public class Passat extends Car {
    public Passat() {
    }

    public Passat(int door, String color, Year productionYear) {
        super(door, color, productionYear);
    }
}
