package pl.sda.patterns.structural.adapter;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;

public class SocketClassAdapterImplTest {

    private SocketClassAdapterImpl sut;

    @Before
    public void init() {
        //given
        sut = new SocketClassAdapterImpl();
    }


    @Test
    public void get120Volt() {
        //when
        Volt volt = sut.get120Volt();
        //then
        assertEquals(volt.getVolts(), 120);
        assertEquals(volt, new Volt(120));
        assertThat(volt, equalTo(new Volt(120)));

    }

    @Test
    public void get12Volt() {
        //when
        Volt volt
        //then

    }

    @Test
    public void get3Volt() {
        //when

        //then

    }
}