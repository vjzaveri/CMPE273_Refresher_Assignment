package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testPerimeter() {
		Triangle t=new Triangle(3, 4, 5);
		assertEquals("12.0", String.valueOf(t.perimeter()));
	}

	@Test
	public void testArea() {
		Triangle t=new Triangle(3, 4, 5);
		assertEquals("6.0", String.valueOf(t.area()));
	}
	
	@Test
	public void testPerimeter1() {
		Triangle t=new Triangle(-3, -4, -5);
		assertEquals("12.0", String.valueOf(t.perimeter()));
	}

	@Test
	public void testArea1() {
		Triangle t=new Triangle(-3, -4, -5);
		assertEquals("6.0", String.valueOf(t.area()));
	}

}