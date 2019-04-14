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
        Volt volt = sut.get12Volt();
        //then
        assertEquals(volt.getVolts(),12);
        assertEquals(volt, new Volt (12));
        assertThat (volt, equalTo(new Volt(12)));


    }

    @Test
    public void get3Volt() {
        //when
        Volt volt = sut.get3Volt();

        //then
        assertEquals(volt.getVolts(),3);
        assertEquals(volt, new Volt(3));
        assertThat(volt, equalTo(new Volt(3)));

    }
}