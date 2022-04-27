package de.com.tdd.money;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {

        Dollar five=new Dollar(5);
       Dollar product= five.times(2);
        assertEquals(new Dollar(10),product);
       product= five.times(3);
        assertEquals(new Dollar(15),product);

    }

    @Test
    public void testEquality() {

        assertEquals(new Dollar(5),new Dollar(5));
        assertNotEquals(new Dollar(5),new Dollar(8));
    }
}
