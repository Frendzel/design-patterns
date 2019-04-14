package pl.sda.patterns.structural.facade;

public class WashingMachine {

    public void loadLaundry() {

    }

    public void setTemperature(int degrees) {
        if (degrees > 100) {
            throw new RuntimeException("It will burn!");
        }
    }

    public void chooseProgram() {

    }

    public void start() {

    }

    public void stop() {

    }

}
