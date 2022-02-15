package people;

import behaviours.IStock;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<IStock> stockOfCars;

    public Dealership(int till, ArrayList<IStock> stockOfCars) {
        this.till = till;
        this.stockOfCars = new ArrayList<IStock>();
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<IStock> getStockOfCars() {
        return stockOfCars;
    }

    public void setStockOfCars(ArrayList<IStock> stockOfCars) {
        this.stockOfCars = stockOfCars;
    }
}
