import org.junit.Before;
import vehicle.HybridCar;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar(7000, "Blue", "Kia", "Rio", 9000);
    }


}
