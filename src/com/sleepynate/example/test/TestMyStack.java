package com.sleepynate.example.test;

import junit.framework.TestCase;

import com.sleepynate.example.MyStack;


public class TestMyStack extends TestCase {
	
	private MyStack m;
	private MyStack<Integer> mInt;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		m = new MyStack<Object>();
		mInt = new MyStack<Integer>();
	}
	
	@SuppressWarnings("unchecked")
	public void testOneThingInStack() {
		m.push(1);
		assertEquals(m.length(), 1);
	}

	public void testOneThingPopped() {
		int x= 5;
		mInt.push(x);
		int y = mInt.pop();
		assertEquals(x, y);
		
		x = 3;
		mInt.push(3);
		y = mInt.pop();
		assertEquals(x, y);
	}
	
	public void testTwoThingsInOneThingPopped() {
		int y = 3;
		mInt.push(5);
		mInt.push(y);
		int y1 = mInt.pop();
		assertEquals(1, mInt.length());
		assertEquals(y, y1);
	}
	
	public void testTwoThingsInTwoThinsgPopped() {
		int x = 5;
		int y = 3;
		mInt.push(5);
		mInt.push(3);
		int y1 = mInt.pop();
		int x1 = mInt.pop();
		assertEquals(0, mInt.length());
		assertEquals(y, y1);
		assertEquals(x, x1);
	}
	
	public void testPoppingEmptyStack() {
		try {
			m.pop();
			fail();
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
	}
	
	public void testPushAnything() {
		m.push("Derp.");
		assertEquals(1, m.length());
	}
}
