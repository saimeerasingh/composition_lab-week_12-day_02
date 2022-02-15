import behaviours.IOwn;

public class HybridCar extends CarType implements IOwn {


    public HybridCar(int price, String color, String make, String model, int mileage) {
        super(price, color, make, model, mileage);
    }

    @Override
    public String carOwned(String carOwned) {
        return null;
    }
}
