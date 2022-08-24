package com.sample;

public class Child extends Parent {
	
	public void display()
	{
		System.out.println("Display");
	}
	void show() {
		System.out.println("Show in derived class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.show();
		ch.display();

	}

}
