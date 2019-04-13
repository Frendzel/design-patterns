package pl.sda.patterns.creational.singleton;

import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertFalse;

public class PropertyLoaderTest {

    @Test
    public void load() {
        //when
        PropertyLoader sut = new PropertyLoader();
        //then
        //TODO
        Properties properties = sut.getProperties();
        assertFalse(properties.isEmpty());
    }
}