 package Java;

import java.util.Scanner;

public class ReverseStringByLoop {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name ");
		String name= sc.nextLine();
		System.out.print("Enter the name1 ");
		String name1= sc.nextLine();
		System.out.print("Enter the name2 ");
		String name2= sc.nextLine();

		isPelindrom(name);
		isPelindrom(name1);
		isPelindrom(name2);
		
		
//		int leng = name.length();
//
//		String rev = "";
//
//		
//		for(int i=leng-1 ; i>=0 ; i-- ) {
//			rev=rev + name.charAt(i);
//		}
//		
//		System.out.println("Reverse of "+name+" is " +rev);
//		
//		if(name.equals(rev)) {
//			
//			System.out.println("is Pelindrom  ");
//		}else {
//		
//			System.out.println("is not Pelindrom  ");
//		}
			 
		
		
	}
	
	static void isPelindrom(String string) {
		
		int leng = string.length();
		String rev = "";
		for(int i=leng-1 ; i>=0 ; i-- ) {
			rev=rev + string.charAt(i);
		}
		
		if(string.equals(rev)) {
			
			System.out.println("is Pelindrom  ");
		}else {
		
			System.out.println("is not Pelindrom  ");
		}

//	    System.out.println("I just got executed!");
	}

}
