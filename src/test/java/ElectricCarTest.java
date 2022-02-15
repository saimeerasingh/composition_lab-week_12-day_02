import org.junit.Before;
import org.junit.Test;
import vehicle.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(5000, "Yellow", "Tesla", "Model S",1000, "Super Charging");
    }

    @Test
    public void canGetChargingType(){
        assertEquals("Super Charging", electricCar.getChargingType());
    }


}
