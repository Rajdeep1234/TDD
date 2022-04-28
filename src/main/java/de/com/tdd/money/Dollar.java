package de.com.tdd.money;

import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }


    // Returning a new object as we cann't use the same instance
    public Money times(int multiplier)
    {
        return new Dollar(amount*multiplier);
    }




}
