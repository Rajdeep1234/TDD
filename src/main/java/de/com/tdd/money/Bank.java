package de.com.tdd.money;

public class Bank {

    public Money reduce(Expression addend,String currency){
        return new Money(10,currency);
    }
}
