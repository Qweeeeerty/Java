package gas;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

public class GasolineTest {
	Gasoline gas = new Gasoline();
	
	@Test
	public void testDistance() throws InputMismatchException {
		gas.Distance();
	}

	@Test
	public void testConsumption() throws InputMismatchException {
		gas.Consumption();
		
	}

	@Test
	public void testPrice() throws InputMismatchException {
		gas.Price();
	}

	@Test
	public void testFuel() {
		//double s = gas.Fuel(17, 22);
		//assertEquals(3.3, s, 1);
		assertNotNull(gas.Fuel());
	}

	@Test
	public void testResult() {
		double res = gas.Result(7,5);
		assertEquals(25, res, 5);
	}

}
