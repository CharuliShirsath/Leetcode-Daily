package com.charu;

public class Parent {
	
	void display() {
        System.out.println("Parent display");
        // 'this' refers to the current object, which could be an instance of Child.
        this.show(); // Use a different method to demonstrate 'this'
    }

    void show() {
        System.out.println("Parent show");
    }
   
}
