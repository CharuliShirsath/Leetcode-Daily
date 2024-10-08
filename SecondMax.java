package com.charu;

public class SecondMax {

	public static void main(String[] args) {
		int a[]= {44,23,67,89,70,65,56};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {  //descending
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ,");
		}
		
	}

}
