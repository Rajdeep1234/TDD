package de.com.tdd.money;

import java.util.Objects;

public class Dollar {
   private  int amount ;

    public Dollar(int amount) {
        this.amount = amount;
    }


    // Returning a new object as we cann't use the same instance
    public Dollar times(int rate){
        return new Dollar(amount*rate);
    }

    //As Dollar is a value object we have to check whether its the same value and object or not
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }


}
