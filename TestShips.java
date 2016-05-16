import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
    TestShips class creates a JUnit test for the Ship, CruiseShip
    and CargoShip classes
 */
public class TestShips {
	CargoShip cargo = new CargoShip("Cargo", "2011", 500);
	CruiseShip cruise = new CruiseShip("Cruise", "2012", 1200);
	Ship ship = new Ship("Ship", "2013");

	//test to verify getName methods
	@Test
	public void testGetName()
	{
		String name = cargo.getName();
		assertEquals("Cargo", name);
		
		name = cruise.getName();
		assertEquals("Cruise", name);
		
		name = ship.getName();
		assertEquals("Ship", name);
	}

	// test to verify yearBuilt methods
	@Test
	public void testYearBuilt()
	{
		String yearBuilt = cargo.getYearBuilt();
		assertEquals("2011", yearBuilt);
		
		yearBuilt = cruise.getYearBuilt();
		assertEquals("2012", yearBuilt);
		
		yearBuilt = ship.getYearBuilt();
		assertEquals("2013", yearBuilt);
	}
	
	// test to verify getTonnage method
	@Test
	public void testGetTonnage()
	{
		int tons = cargo.getTonnage();
		assertEquals(Integer.toString(tons), "500");
	}
	
	// test to verify getPassengers method
	@Test
	public void testGetPassengers()
	{
		int passengers = cruise.getPassengers();
		assertEquals(Integer.toString(passengers), "1200");
	}
	
	// test to verify toString methods
	@Test
	public void testToString()
	{
		String str1 = cargo.toString();
		assertEquals("Name: Cargo\nCargo capacity: 500 tons", str1);
		
		String str2 = cruise.toString();
		assertEquals("Name: Cruise\nMaximum passengers: 1200", str2);
		
		String str3 = ship.toString(); 
		assertEquals("Name: Ship\nYear built: 2013", str3);
	}
}
