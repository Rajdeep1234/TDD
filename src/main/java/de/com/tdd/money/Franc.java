package de.com.tdd.money;

public class Franc extends Money{

    public Franc(int amount,String currency) {
        super(amount, currency);
    }


    // Returning a new object as we cann't use the same instance
    public Money times(int multiplier){

        return Money.franc(amount*multiplier);
    }

}
