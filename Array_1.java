package com.charu;

public class Array_1 {

	public static void main(String[] args) {
		
		int x[][]= {{1,2,3},{9,8,7},{10,15,16}};
		
		for(int i=0;i<=x.length-1;i++) {
			for(int j=0;j<=x[i].length-1;j++) {
				System.out.print(x[i][j]);
			}
		}
		System.out.println();

	}

}
