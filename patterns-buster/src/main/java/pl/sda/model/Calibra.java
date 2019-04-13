package pl.sda.model;

import lombok.Builder;

import java.time.Year;

@Builder
public class Calibra extends Car {

    public Calibra() {
    }

    public Calibra(int door, String color, Year productionYear) {
        super(door, color, productionYear);
    }
}
