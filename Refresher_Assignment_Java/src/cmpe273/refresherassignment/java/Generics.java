package cmpe273.refresherassignment.java;

import java.util.Scanner;

public class Generics<T> {

	T[] allEmployees;
	int numberOfEmployees;
	
	@SuppressWarnings("unchecked")
	public Generics(int size)
	{
		allEmployees=(T[]) new Employee[size];
		numberOfEmployees=0;
	}
	
	@SuppressWarnings("unchecked")
	public Employee addNewEmployee(Employee data)
	{
		data.calculateSalary();
		allEmployees[numberOfEmployees]=(T) data;
		numberOfEmployees++;
		return data;
	}
	
	public static void main(String args[])
	{
		Generics<Employee> newCompany=new Generics<Employee>(100);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee's First Name:");
		String fName=sc.next();
		System.out.println("Enter Employee's Last Name:");
		String lName=sc.next();
		System.out.println("Enter Employee's total Experience:");
		float exp=sc.nextFloat();
		Employee newEmployee=new Employee(fName, lName, exp);
		
		newEmployee=newCompany.addNewEmployee(newEmployee);
		
		System.out.println("Currently added Employee details:");
		System.out.println("First name: "+newEmployee.getFirstName());
		System.out.println("Last Name: "+newEmployee.getLastName());
		System.out.println("Experience: "+newEmployee.getExperience());
		System.out.println("Salary/Annum: "+newEmployee.getSalary()+"$");
		System.out.println("Hike: "+newEmployee.getHike()+"%");
		sc.close();
	}
	
}
