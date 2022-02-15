package people;

import behaviours.IOwn;

import java.util.ArrayList;

public class Customer {

    private int money;
    private IOwn carOwned;

    public Customer(int money, IOwn carOwned) {
        this.money = money;
        this.carOwned = carOwned;
    }
}
