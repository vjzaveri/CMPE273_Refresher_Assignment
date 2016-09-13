package cmpe273.refresherassignment.java;

public class Triangle implements Shapes {

	int sideA, sideB, sideC;
	
	public Triangle(int sideA, int sideB, int sideC)
	{
		if(sideA<0)
			this.sideA=sideA*-1;
		else
			this.sideA=sideA;
		if(sideB<0)
			this.sideB=sideB*-1;
		else
			this.sideB=sideB;
		if(sideC<0)
			this.sideC=sideC*-1;
		else
			this.sideC=sideC;
	}
	
	@Override
	public double perimeter() {
		return sideA+sideB+sideC;
	}

	@Override
	public double area() {
		double semiPerimeter=this.perimeter()/2;
		
		return Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
	}

}
