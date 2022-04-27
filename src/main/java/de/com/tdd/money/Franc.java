package de.com.tdd.money;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }


    // Returning a new object as we cann't use the same instance
    public Franc times(int rate){
        return new Franc(amount*rate);
    }

}
