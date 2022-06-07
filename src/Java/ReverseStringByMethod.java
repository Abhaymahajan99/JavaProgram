package Java;

import java.util.Scanner;

public class ReverseStringByMethod {
	
public static void main(String[] args) {
	
	System.out.println("Enter Word");
	
	Scanner sc=new Scanner(System.in);
	
	String name= sc.nextLine();

	
	//System.out.println("Name:"+ name);
	
// Using StringBuffer class
StringBuffer a = new StringBuffer(name);

// use reverse() method to reverse string
System.out.println("Reverse String :  "+ a.reverse());


}


}
