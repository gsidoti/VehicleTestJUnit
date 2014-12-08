package MainPackage;

import static org.junit.Assert.*;
import org.junit.Test;
import MainPackage.Car;
import MainPackage.Motorcycle;
import MainPackage.Person;
import MainPackage.Truck;

public class VehicleTestJUnit {
	@Test
	public void JUnit() {
		Person a = new Person();
		a.setFirstName("Jimmy");
		Car newcar = new Car();
		newcar.setOwner(a);
		newcar.setNumberOfDoors(4);
		assertEquals("Name of Person A", "Jimmy", a.getFirstName());
		Truck newtruck = new Truck();
		newtruck.setOwner(a);
		newtruck.setNumberOfAxels(2);
		assertEquals("Truck owned by person A", "Jimmy", newtruck
				.getOwner().getFirstName());
		Person b = new Person();
		b.setFirstName("Vinny");
		newtruck.setOwner(b);
		assertEquals("Truck owned by person B", "Vinny", newtruck
				.getOwner().getFirstName());
		Motorcycle newmotorcycle = new Motorcycle();
		newmotorcycle.setHasSideCar(false);
		assertEquals("Car has 4 doors", 4,
				newcar.getNumberOfDoors());
		assertEquals("The truck has 2 axels", 2,
				newtruck.getNumberOfAxels());
		assertEquals("Motorcycle has no sidecar", false,
				newmotorcycle.isHasSideCar());
	}
}