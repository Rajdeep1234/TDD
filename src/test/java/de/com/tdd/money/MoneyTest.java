package de.com.tdd.money;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {

        Money five=Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));

        Money fiveF=Money.franc(5);
        assertEquals(Money.franc(10), fiveF.times(2));

    }

    @Test
    public void testEquality() {

        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(8));

        assertNotEquals(Money.dollar(5),Money.franc(5));

        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(8));

    }



    @Test
    public void testCurrency() {
        assertEquals("USD",Money.dollar(2).currency());
        assertEquals("CHF",Money.franc(2).currency());
    }

    @Test
    public void testSimpleAddition() {
     Money five=Money.dollar(5);
     Expression sum =five.plus(five);
     Bank bank =new Bank();
     Money reduced=bank.reduce(sum,"USD");
        assertEquals(Money.dollar(10),reduced);
    }

    @Test
    public void testPlusReturnsSum() {
        Money five=Money.dollar(5);
        Expression result= five.plus(five);

        Sum sum= (Sum) result;

        assertEquals(five, sum.addend);
        assertEquals(five,sum.augend);

    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3),Money.dollar(5));
        Bank bank =new Bank();
        Money result= bank.reduce(sum,"USD");
        assertEquals(Money.dollar(8),result);
    }


    @Test
    public void testReduceMoney() {
        Bank bank=new Bank();
        Money result=bank.reduce(Money.dollar(1),"USD");
        assertEquals(Money.dollar(1),result);
    }

    @Test
    public void testReduceMoneyToDifferentCurrency() {
        Bank bank=new Bank();
        bank.addRate("CHF","USD",2);
        Money result=bank.reduce(Money.franc(2),"USD");
        assertEquals(Money.dollar(1),result);

    }

    @Test
    public void testIdentityRate() {
        assertEquals(new Bank().rate("USD","USD"),1);
        assertEquals(new Bank().rate("CHF","CHF"),1);
    }
}
