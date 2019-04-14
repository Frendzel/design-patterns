package pl.sda.patterns.structural.facade;


import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class WashingFacadeTest {

    @Test
    public void shouldStartTheLaundryIfAllConditionsAreOk() {
    }

    @Test
    public void shouldThrowExceptionIfDryingRackIsFull() {

    }

    //    @Test(expected = RuntimeException.class)
    @Test
    public void start() {
        WashingFacade washingFacade = new WashingFacade();
        washingFacade.start(WashingParams.builder().degrees(100).build());
        try {
            washingFacade.stop();
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}