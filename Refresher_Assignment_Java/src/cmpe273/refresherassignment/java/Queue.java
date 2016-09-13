package cmpe273.refresherassignment.java;

import java.util.Scanner;

public class Queue<T> {

	private int front;
	private int top;
	private T[] queue;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Queue(int size)
	{
		this.size=size;
		queue=(T[]) new Person[size];
		top=-1;
		front=-1;
	}
	
	public boolean enQueue(T data)
	{
		if (top-front==size-1)
		{
			throw new IllegalStateException("Queue Full");
		}
		else
		{
			if(front==-1)
			{
				front++;
			}
			queue[++top]=data;
			return true;
		}
	}
	
	public T deQueue()
	{
		T data=null;
		if(front>=top)
		{
			if(front>top || (front==-1 && top==-1))
			{
				System.out.println("Empty Queue");
			}
		}
		else if(top==front)
		{
			data=queue[front];
			front=-1;
			top=-1;
		}
		else
		{
			data=queue[front];
			front++;
		}
		return data;
	}
	
	public void display()
	{
		if(front>top || (front==-1 && top==-1))
		{
			System.out.println("Empty Queue");
		}
		else
		{
			for(int i=front;i<=top;i++)
			{
				Person p=new Person();
				p.display((Person)queue[i]);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Queue<Person> fall16=new Queue<Person>(10);
		
		Scanner sc=new Scanner(System.in);
		int input;
		do
		{
		System.out.println("What do you want to do: \n1.Enter new Applicant in queue.\n2.Retrieve First Applicant in queue waiting to process.\n3.Display whole queue.\n0.EXIT");
		input=Integer.parseInt(sc.next());
		sc.nextLine();
		Person a=new Person();
		switch (input) 
		{
		case 1:
			System.out.println("Enter Name:");
			a.setName(sc.nextLine());
			System.out.println("Enter Department:");
			a.setDepartment(sc.nextLine());
			fall16.enQueue(a);
			break;
			
		case 2:
			a=fall16.deQueue();
			a.display(a);
			break;
			
		case 3:
			System.out.println("List of all the applicants in the queue:");
			fall16.display();
			break;
			
		default:
			System.out.println("Enter valid input!!");
		}
		}while(input != 0);
	
		sc.close();
	}	
}