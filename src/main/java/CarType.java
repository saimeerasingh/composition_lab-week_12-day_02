public abstract class CarType {
    private int price;
    private String color;
    private String make;
    private String model;
    private int mileage;

    public CarType(int price, String color, String make, String model, int mileage) {
        this.price = price;
        this.color = color;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }
}
