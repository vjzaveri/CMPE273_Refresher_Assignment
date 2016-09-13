package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testEnQueue() {
		Queue<Person> fall16=new Queue<Person>(10);
		
		Person a=new Person();
		a.setName("Vansh Zaveri");
		a.setDepartment("Software Engineering");
		assertTrue(fall16.enQueue(a));
	}

	@Test
	public void testEnQueue1() {
		Queue<Person> fall16=new Queue<Person>(10);
		
		Person a=new Person();
		a.setName("Vansh Zaveri");
		a.setDepartment("Software Engineering");
		fall16.enQueue(a);
		fall16.enQueue(a);
		fall16.enQueue(a);
		fall16.enQueue(a);
		fall16.enQueue(a);
		fall16.enQueue(a);
		assertTrue(fall16.enQueue(a));
	}
	
	@Test
	public void testDeQueue() {
		Queue<Person> fall16=new Queue<Person>(10);		
		Person a=new Person();
		a.setName("Vansh Zaveri");
		a.setDepartment("Software Engineering");
		fall16.enQueue(a);
		assertEquals(a, fall16.deQueue());
	}

}
