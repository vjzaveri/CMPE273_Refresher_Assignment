package cmpe273.refresherassignment.java;

public class Employee {

	private String firstName;
	private String lastName;
	private float experience;
	private double salary;
	private double hike;
	
	public Employee(String firstName, String lastName, float experience)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		if(experience<0)
			this.experience=experience*-1;
		else
			this.experience=experience;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getHike() {
		return hike;
	}
	public void setHike(double hike) {
		this.hike = hike;
	}
	
	public double calculateSalary()
	{
		if(this.getExperience()<5.0 && this.getExperience()>2.0)
		{
			this.setSalary(60000);
		}
		else if(this.getExperience()>=5)
		{
			this.setSalary(100000);
		}
		else
		{
			this.setSalary(50000);
		}
		this.calculateHike();
		return this.getSalary();		
	}
	
	public double calculateHike()
	{
		if(this.getSalary()>=50000)
		{
			this.setHike(10);
		}
		if(this.getSalary()>=100000)
		{
			this.setHike(15);
		}
		else
		{
			this.setHike(7);
		}
		this.setSalary(this.getSalary()+(this.getSalary()*this.getHike()/100));
		return this.getHike();
	}
}
