package com.charu;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
	    int[] x = new int[5];
	    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 numbers:");

        for (int i = 0; i <= 5; i++) {
        	x[i]=sc.nextInt();
        	System.out.println(x[i]);
         // int a =  x[i];
         // System.out.println(sc.nextInt()+x[i]);
        }
        
        sc.close();

      //  System.out.println("Entered numbers:");
        for (int element : x) {
            System.out.println(element);
        }
    }
}

