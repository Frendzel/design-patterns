package pl.sda.patterns.structural.facade;

public class DryingRack {

    private boolean isEmpty;

    public void hangLaundry() {
        if (!isEmpty) {
            throw new RuntimeException("Please remove old laundry!");
        }
    }

    public void removeOldLaundry() {
        isEmpty = true;
    }
}
