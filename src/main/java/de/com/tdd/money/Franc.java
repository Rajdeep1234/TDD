package de.com.tdd.money;

public class Franc {

    private  int amount ;

    public Franc(int amount) {
        this.amount = amount;
    }


    // Returning a new object as we cann't use the same instance
    public Franc times(int rate){
        return new Franc(amount*rate);
    }

    //As Franc is a value object we have to check whether its the same value and object or not
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }


}
