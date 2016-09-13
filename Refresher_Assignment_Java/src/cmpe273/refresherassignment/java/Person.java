package cmpe273.refresherassignment.java;

public class Person {

	String name=new String();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String department=new String();
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void display(Person p)
	{
		System.out.println(p.getName());
		System.out.println(p.getDepartment());
		System.out.println("------------------");
	}
}
