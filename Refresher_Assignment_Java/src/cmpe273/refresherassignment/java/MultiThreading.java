package cmpe273.refresherassignment.java;

import java.util.ArrayList;
import java.util.Random;

public class MultiThreading implements Runnable {

	ArrayList<Integer> a;
	int searchNumber;
	Thread t;
	@Override
	public void run() {
		int x= Integer.parseInt(Thread.currentThread().getName());
		search(x);
	}
	
	public MultiThreading(int size)
	{
		int noOfThreads=(int)size/15000;
		a=new ArrayList<Integer>(size);
		Random rand= new Random();
		for(int i=0;i<size;i++)
		{
			a.add(rand.nextInt(65536));
		}
		searchNumber=a.get(65500);
		for(int a=0;a<noOfThreads;a++)
		{
			t=new Thread(this, Integer.toString(a+1));
			t.start();
		}
	}
	
	public int search(int x)
	{ 
			for(int i=15000*x;i<Math.min(15000*x+15000,a.size());i++)
			{
				if(a.get(i)==searchNumber)
				{
					System.out.println("Number found by thread:"+Thread.currentThread().getName()+" at position: "+i);
					return i;
				}
			}
			return -1;
	}
	
	public static void main(String args[])
	{
		long startTime = System.nanoTime();
		new MultiThreading(65536);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
	}
	
}
