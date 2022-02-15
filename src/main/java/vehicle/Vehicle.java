package vehicle;

import behaviours.IOwn;
import behaviours.IStock;

public class Vehicle {

   private IOwn ownedCars;
   private IStock carsInStock;

    public Vehicle(IOwn ownedCars, IStock carsInStock) {
        this.ownedCars = ownedCars;
        this.carsInStock = carsInStock;
    }
}
