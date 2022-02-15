import org.junit.Before;
import org.junit.Test;
import vehicle.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(10000,"Red", "Renault", "Clio", 3000, "Petrol");
    }

    @Test
    public void testCanGetFuelType(){
        assertEquals("Petrol", car.getFuelType());
    }


}
