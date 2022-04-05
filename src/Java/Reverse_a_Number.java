package Java;

import java.util.Scanner;

public class Reverse_a_Number {
	public static void main(String[] args) {
		int rev=0;
		int rem;
		System.out.print("Enter the number to reverse : ");
		Scanner sc=new Scanner(System.in); 
		int num=sc.nextInt();
		
		while(num!=0)
		{
			rem = num%10;
			
			rev =rev*10+rem;
			
			num= num/10;
		}
		
		System.out.println("Reverse of entered number is : "+rev);
	}
		
	}
