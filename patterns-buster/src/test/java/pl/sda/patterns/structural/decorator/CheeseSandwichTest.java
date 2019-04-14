package pl.sda.patterns.structural.decorator;

import org.junit.Test;

public class CheeseSandwichTest {

    @Test
    public void createSandwichTest() {
        WhiteBreadSandwich whiteBreadSandwich = new WhiteBreadSandwich("buleczka");
        System.out.println(whiteBreadSandwich.description + whiteBreadSandwich.getPrice());
        CheeseSandwich cheeseSandwich = new CheeseSandwich(whiteBreadSandwich);
        System.out.println(cheeseSandwich.getDesc() + cheeseSandwich.getPrice());
        HamSandwich hamSandwich = new HamSandwich(cheeseSandwich);
        System.out.println(hamSandwich.geDescription() + hamSandwich.getPrice());

        HamSandwich hamSandwich2 = new HamSandwich(new CheeseSandwich(new WhiteBreadSandwich("buleczka")));


    }

}