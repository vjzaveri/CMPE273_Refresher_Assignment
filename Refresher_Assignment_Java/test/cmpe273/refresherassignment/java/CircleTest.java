package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testPerimeter() {
		Circle c=new Circle(3);
		assertEquals("18.84", String.valueOf(c.perimeter()));
	}

	@Test
	public void testArea() {
		Circle c=new Circle(3);
		assertEquals("28.259999999999998", String.valueOf(c.area()));
	}
	
	@Test
	public void testPerimeter1() {
		Circle c=new Circle(-3);
		assertEquals("18.84", String.valueOf(c.perimeter()));
	}

	@Test
	public void testArea1() {
		Circle c=new Circle(-3);
		assertEquals("28.259999999999998", String.valueOf(c.area()));
	}

}
