package de.com.tdd.money;

public interface Expression {
    public  Money reduce(Bank bank, String currency);
}
