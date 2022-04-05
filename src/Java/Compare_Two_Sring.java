package Java;

import java.util.Scanner;

public class Compare_Two_Sring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string");
		
		String a = sc.nextLine();
		
		System.out.println("Enter second string");
		
		 String b = sc.nextLine();
		 
		 if(a.compareTo(b) > 0)
			 
			 System.out.println("First string is Greater then Second");
		 
		 else if(a.compareTo(b) < 0)
			 
			 System.out.println("First string is Smaller then Second");
		 
		 else
			 
			 System.out.println("Both strings are Equal");
		 
		 

	}

}
