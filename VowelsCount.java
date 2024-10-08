package com.charu;

public class VowelsCount {
	
		public static void main(String[] args) {
			String str = "0110d004181001";
			String zerocount="";
			String onecount="";
			String notequal="";
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='0') {
					//System.out.print(str.charAt(i)+", ");
					zerocount +='0';
				}
				else if(str.charAt(i)=='1') {
					//System.out.print(str.charAt(i)+", ");
					onecount +='1';
				}else if(str.charAt(i)!='0'&& str.charAt(i)!='1') {
					notequal +=str.charAt(i);
					
				}
			}
			
			System.out.println("count of zero: "+ zerocount);
			System.out.println("count of one: "+onecount);
			System.out.println("not equals are: "+notequal);
			
			
		}
}
