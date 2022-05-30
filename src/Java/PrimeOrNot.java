package Java;

import java.util.Scanner;

public class PrimeOrNot 
{

	public static void main(String[] args)
	{

		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Prime or not");
		int n = sc.nextInt();

		if(n==1) {
			System.out.println("Prime number start from 2");	
		}

		for(int i=2 ; i<= n-1 ; i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}

		}
		if(temp>0)

			System.out.println(n+" is not prime");
		else 
			System.out.println(n+" is prime");

	}

}
