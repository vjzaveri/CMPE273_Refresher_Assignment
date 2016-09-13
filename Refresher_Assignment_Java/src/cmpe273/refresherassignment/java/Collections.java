package cmpe273.refresherassignment.java;

import java.util.ArrayList;
import java.util.Random;

public class Collections {

	ArrayList<Integer> a;
	
	public Collections(int size)
	{
		a=new ArrayList<Integer>(size);
		Random rand= new Random();
		for(int i=0;i<size;i++)
		{
			a.add(rand.nextInt(65536));
		}
	}
	
	public int search(int x)
	{
		int j,pos=-1;
		for(j=0;j<a.size();j++)
		{
			if(a.get(j)==x)
			{
				pos=j;
			}
		}
		if(pos==-1)
			return -1;
		else
			return pos;
	}
	
	
	public static void main(String args[])
	{
		long startTime = System.nanoTime();
		Collections c=new Collections(65536);
		/*Selecting the nearest to last element and hardcoding 
		 * it to find in ArrayList, to calculate the maximum number
		 *  of time taken to traverse through whole ArrayList*/
		int temp=c.a.get(65500);
		int pos=c.search(temp);
		System.out.println(temp+" number found at location:"+pos);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
	
}
