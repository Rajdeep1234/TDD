package de.com.tdd.money;

public class Dollar {
    int amount ;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int rate){
        return new Dollar(amount*rate);
    }
}
