package Java;

import java.util.Scanner;

public class Swap_Two_Number_without_3rd_variable  {

	public static void main(String args[]) {
		
		System.out.println("Enter the value of x and y");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int y = sc.nextInt();
		
		System.out.println("Before swaping number: " +x+ " " +y);
		
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swaping number: " +x+ " " +y);
		
		
}
	}