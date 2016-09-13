package cmpe273.refresherassignment.java;

import java.util.Scanner;

public class Interfaces {

	public static void main(String args[])
	{
		System.out.println("Enter Radius of circle:");
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		sc.nextLine();
		Circle c=new Circle(radius);
		System.out.println("The perimeter of circle with radius: "+c.radius+" is:"+c.perimeter()+", and the area is:"+c.area());
		
		System.out.println("Enter Sides of Triangle:\nSide One:");
		int sideA=sc.nextInt();
		System.out.println("\nSide Two:");
		int sideB=sc.nextInt();
		System.out.println("\nSide Three:");
		int sideC=sc.nextInt();
		Triangle t=new Triangle(sideA,sideB,sideC);
		System.out.println("The perimeter of triangle with sides: "+t.sideA+","+t.sideB+" and "+t.sideC+" is:"+t.perimeter()+", and the area is:"+t.area());
		sc.close();
	}
	
}
