package pl.sda.patterns.structural.bridge;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import pl.sda.patterns.structural.bridge.color.BlueColor;
import pl.sda.patterns.structural.bridge.color.ColorType;

class ShapeTest {

    @Test
    void shouldCorrectlyFillTheColor() {
        //given
        Diamond diamond = new Diamond(new BlueColor());
        //when
        diamond.applyColor();
        //then
        Assert.assertEquals(diamond.getColor(), ColorType.BLUE);
    }
}