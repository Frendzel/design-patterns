package pl.sda.patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Volt implements Cloneable {
    private int volts;

    public Volt copy() {
        return this.copy();
    }

}