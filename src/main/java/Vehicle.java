public abstract class Vehicle {

    private int price;
    private String color;
    private String make;
    private String model;

    public Vehicle(int price, String color, String make, String model) {
        this.price = price;
        this.color = color;
        this.make = make;
        this.model = model;
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
}
