package cmpe273.refresherassignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testCalculate() {
		Stack s=new Stack(20);
		String[] expression=new String[10];
		expression[0]="6";
		expression[1]="2";
		expression[2]="+";
		expression[3]="2";
		expression[4]="/";
		expression[5]="5";
		expression[6]="1";
		expression[7]="+";
		expression[8]="*";		
		
		assertEquals("24", s.Calculate(expression));
	}

	@Test
	public void testPush() {
		Stack s=new Stack(20);
		s.push("test");
		assertEquals("test", s.pop());
	}

	@Test
	public void testPop() {
		Stack s=new Stack(20);
		s.push("test");
		assertEquals("test", s.pop());
	}
	
	@Test
	public void testCalculate1() {
		Stack s=new Stack(20);
		String[] expression=new String[10];
		expression[0]="0";
		
		assertEquals("0", s.Calculate(expression));
	}

}
