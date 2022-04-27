package de.com.tdd.money;

public class Dollar {
    int amount ;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int rate){
        this.amount*=rate;
    }
}
