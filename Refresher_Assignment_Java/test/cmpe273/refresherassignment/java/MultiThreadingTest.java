package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiThreadingTest {

	@Test
	public void testSearch() {
		MultiThreading m= new MultiThreading(65536);
		assertEquals(65500, m.search(4));
	}

}
