public class Car extends Vehicle {

    private String fuelType;

    public Car(int price, String color, String make, String model,int mileage,String fuelType) {
        super(price, color, make, model,mileage);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
