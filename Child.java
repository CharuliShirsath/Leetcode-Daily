package com.charu;

public class Child extends Parent {
	
	@Override
	void display() {
        // Calls the display() method of Parent class
        super.display();
        System.out.println("Child display");
    }

    @Override
    void show() {
        System.out.println("Child show");
    }
	
	public static void main(String[] args) {
		Child c = new Child();
		c.display(); // This will call Child's show() method after Parent's display
	}
}
