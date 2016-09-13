package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testCalculateSalary() {
		String fName="Vansh";
		String lName="Zaveri";
		float exp=6;
		Employee newEmployee=new Employee(fName, lName, exp);
		newEmployee.calculateSalary();
		assertEquals("115000.0", String.valueOf(newEmployee.calculateSalary()));
	}

	@Test
	public void testCalculateHike() {
		String fName="Vansh";
		String lName="Zaveri";
		float exp=6;
		Employee newEmployee=new Employee(fName, lName, exp);
		newEmployee.calculateSalary();
		assertEquals("15.0", String.valueOf(newEmployee.calculateHike()));
	}
	
	@Test
	public void testCalculateSalary1() {
		String fName="Vansh";
		String lName="Zaveri";
		float exp=-6;
		Employee newEmployee=new Employee(fName, lName, exp);
		newEmployee.calculateSalary();
		assertEquals("115000.0", String.valueOf(newEmployee.calculateSalary()));
	}

	@Test
	public void testCalculateHike1() {
		String fName="Vansh";
		String lName="Zaveri";
		float exp=-6;
		Employee newEmployee=new Employee(fName, lName, exp);
		newEmployee.calculateSalary();
		assertEquals("15.0", String.valueOf(newEmployee.calculateHike()));
	}

}
