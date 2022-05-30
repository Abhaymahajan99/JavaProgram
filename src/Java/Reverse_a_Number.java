package Java;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number to reverse : ");


		int num=sc.nextInt();
		
		int temp = num;
		int rev=0;
		int rem;

		while(temp!=0)
		{
			rem = temp%10;

			rev =rev*10+rem;

			temp= temp/10;
		}


		if(num==rev)

			System.out.println(num +" is a pelendrom");

		else 

			System.out.println(num +" is not a pelenrom");


	}
}
