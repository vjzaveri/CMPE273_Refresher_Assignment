package cmpe273.refresherassignment.java;

public class Circle implements Shapes {

	int radius;
	
	public Circle(int radius)
	{
		if(radius<=0)
		{
			this.radius=radius*-1;
		}
		else
		{
			this.radius=radius;
		}
	}
	
	@Override
	public double perimeter() {
		return 2*3.14*radius;
	}

	@Override
	public double area() {
		return 3.14*radius*radius;
	}

}
