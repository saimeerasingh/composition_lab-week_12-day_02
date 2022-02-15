public class ElectricCar extends Vehicle{

    private String chargingType;


    public ElectricCar(int price, String color, String make, String model, int mileage, String chargingType) {
        super(price, color, make, model,mileage);
        this.chargingType = chargingType;
    }

    public String getChargingType() {
        return chargingType;
    }
}
