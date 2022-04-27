package de.com.tdd.money;

import java.util.Objects;

public class Dollar {
    int amount ;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int rate){
        return new Dollar(amount*rate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }


}
