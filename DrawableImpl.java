package com.charu;

public class DrawableImpl implements Drawable{

	
	public static void main(String[] args) {
		DrawableImpl dr = new DrawableImpl();
		
		dr.add();
		System.out.println("Hello");
	}

	@Override
	public void add() {
		
		System.out.println("The addition is");
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	
}
