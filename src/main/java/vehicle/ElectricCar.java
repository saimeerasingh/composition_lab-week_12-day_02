package vehicle;

import behaviours.IOwn;
import vehicle.CarType;

public class ElectricCar extends CarType implements IOwn {

    private String chargingType;


    public ElectricCar(int price, String color, String make, String model, int mileage, String chargingType) {
        super(price, color, make, model,mileage);
        this.chargingType = chargingType;
    }

    public String getChargingType() {
        return chargingType;
    }

    @Override
    public String carOwned(String carOwned) {
        return null;
    }
}
