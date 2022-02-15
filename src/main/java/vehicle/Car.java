package vehicle;

import behaviours.IOwn;

public class Car extends CarType implements IOwn {

    private String fuelType;

    public Car(int price, String color, String make, String model,int mileage,String fuelType) {
        super(price, color, make, model,mileage);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String carOwned(String carOwned) {
        return null;
    }
}
