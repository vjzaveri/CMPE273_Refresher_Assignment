package cmpe273.refresherassignment.java;

import java.util.Random;

public class Array {

	public int[] bubbleSort(int[] mixed)
	{
		boolean swapped=true;
		int i;
		while(swapped)
		{
			swapped=false;
			for(i=0;i<mixed.length-1;i++)
			{
				if(mixed[i]>mixed[i+1])
				{
					int temp=mixed[i];
					mixed[i]=mixed[i+1];
					mixed[i+1]=temp;
					swapped=true;				
				}
			}
		}
		return mixed;
	}
	
	public static void main(String args[])
	{
		int[] mixed=new int[10];
		int[] sorted=new int[10];
		Random rand=new Random();
		
		for(int i=0; i<mixed.length;i++)
		{
			mixed[i]=rand.nextInt(100);
		}
		System.out.println("Original Array:");
		for(int i=0;i<mixed.length;i++)
		{
			System.out.print(mixed[i]+":");
		}
		sorted=new Array().bubbleSort(mixed);
		
		System.out.println("\nSorted Array using Bubble Sort:");
		for(int i=0;i<sorted.length;i++)
		{
			System.out.print(sorted[i]+":");
		}
		
	}
	
}
