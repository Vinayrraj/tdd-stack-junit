package com.sleepynate.example;

import java.util.ArrayList;


public class MyStack<T> {

	private ArrayList<T> containers;

	public MyStack() {
		containers = new ArrayList<T>();
	}
	
	public void push(T i) {
		containers.add(i);
	}

	public int length() {
		// TODO Auto-generated method stub
		return containers.size();
	}

	public T pop() {
		return containers.remove(containers.size()-1);
	}

}
