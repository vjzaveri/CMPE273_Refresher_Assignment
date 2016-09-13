package cmpe273.refresherassignment.java;

import java.util.Scanner;


public class Stack {

	private int top;
	String[] stack;
	int size;
	
	public Stack(int size)
	{
		this.size=size;
		top=-1;
		stack=new String[size];
	}
	
	public String Calculate(String[] expression)
	{
		int i=0;
		if(expression[0]!=null)
		{
		do
		{
			if(expression[i].charAt(0)!='*' && expression[i].charAt(0)!='/' && expression[i].charAt(0)!='+' && expression[i].charAt(0)!='-')
			{
				push(expression[i++]);
			}
			else
			{
				int right,left,result=0;
				right=Integer.parseInt(pop());
				left=Integer.parseInt(pop());
				
				switch(expression[i].charAt(0))
				{
				case '*': result=left*right;break;
				case '/': result=left/right;break;
				case '+': result=left+right;break;
				case '-': result=left-right;break;
				//default: throw new IllegalStateException("Unknown AlphaNumeric");
				}				
				
				push(Integer.toString(result));
				i++;
			}
		}while(expression[i]!=null);
		}
		return pop();
	}
	
	public void push(String data)
	{
		if(top==size-1)
		{
			throw new IllegalStateException("Stack Full");
		}
		else
		{
		stack[++top]=data;
		}
	}
	
	public String pop()
	{
		if(top==-1)
		{
			throw new IllegalStateException("Stack Empty");
		}
		else
		{
			return stack[top--];
		}
	}
	
	public static void main(String[] args)
	{
		Stack s=new Stack(20);
		String[] expression=new String[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Postfix Expression to evaluate:");
		String temp=sc.nextLine();
		for(int i=0;i<temp.length();i++)
		{
			expression[i]=String.valueOf(temp.charAt(i));
		}

		
		System.out.println("Evaluation result: "+s.Calculate(expression));
		sc.close();
	}
	
}
