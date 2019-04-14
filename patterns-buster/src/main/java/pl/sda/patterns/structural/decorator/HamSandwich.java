package pl.sda.patterns.structural.decorator;

public class HamSandwich extends SandwichDecorator {
    Sandwich sandwich;

    public HamSandwich (Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public String geDescription(){
        sandwich.description = sandwich.description + "with ham";
        return sandwich.description;
    }

    @Override
    protected int getPrice() {
        return sandwich.getPrice() + 5;
    }
}
