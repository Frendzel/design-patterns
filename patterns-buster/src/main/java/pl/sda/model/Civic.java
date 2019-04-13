package pl.sda.model;

import lombok.Builder;

import java.time.Year;

@Builder
public class Civic extends Car {
    public Civic() {
    }

    public Civic(int door, String color, Year productionYear) {
        super(door, color, productionYear);
    }
}
