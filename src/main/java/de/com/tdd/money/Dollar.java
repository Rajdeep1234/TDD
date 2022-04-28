package de.com.tdd.money;

import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount,String currency) {
        super(amount, currency);
    }


    // Returning a new object as we cann't use the same instance
    public Money times(int multiplier)
    {
        return Money.dollar(amount*multiplier);
    }




}
