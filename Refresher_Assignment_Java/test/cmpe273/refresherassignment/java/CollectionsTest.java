package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionsTest {

	@Test
	public void testSearch() {
		Collections c=new Collections(65536);
		int temp=c.a.get(65500);
		int pos=c.search(temp);
		assertEquals(65500, pos);
	}
	
	@Test
	public void testSearch1() {
		Collections c=new Collections(65536);
		int temp=-45;
		int pos=c.search(temp);
		assertEquals(-1, pos);
	}

}
