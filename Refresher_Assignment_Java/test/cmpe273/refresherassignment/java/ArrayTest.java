package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testBubbleSort() {
		int[] mixed=new int[5];
		mixed[0]=45;
		mixed[1]=56;
		mixed[2]=34;
		mixed[3]=11;
		mixed[4]=78;
		
		int[] sorted=new int[5];
		sorted[0]=11;
		sorted[1]=34;
		sorted[2]=45;
		sorted[3]=56;
		sorted[4]=78;
		
		assertArrayEquals(sorted, new Array().bubbleSort(mixed));
		
	}
	
	@Test
	public void testBubbleSort2() {
		int[] mixed=new int[5];
		mixed[0]=-45;
		mixed[1]=56;
		mixed[2]=-34;
		mixed[3]=10;
		mixed[4]=7;
		
		int[] sorted=new int[5];
		sorted[0]=-45;
		sorted[1]=-34;
		sorted[2]=7;
		sorted[3]=10;
		sorted[4]=56;
		
		assertArrayEquals(sorted, new Array().bubbleSort(mixed));
		
	}

}
