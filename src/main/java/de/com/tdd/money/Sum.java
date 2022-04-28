package de.com.tdd.money;

public class Sum implements  Expression{
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }


    @Override
    public Money reduce(Bank bank, String toCurrency) {
        return new Money(this.addend.amount+this.augend.amount,toCurrency);
    }
}
