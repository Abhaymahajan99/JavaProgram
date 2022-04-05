package Java;

import java.util.Scanner;

public class Print_1_to_n_numbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		
		int n= sc.nextInt();
		
		for(int i=n ; i>=1 ; i--)
		{
			System.out.println(i);
		}
	}

}
