package Java;

import java.util.Scanner;

public class prime_number_from_1_to_n {

	public static void main(String[] args) {

		System.out.println("Enter number");

		Scanner sc= new Scanner(System.in);

		int n=sc.nextInt();

		System.out.println("Prime number between 1 and " + n);
		
		//loop through the numbers one by one
		for(int i=1 ; i<n ; i++)
		{
			boolean isPrime=true;

			//check to see if the number is prime
			for(int j=2 ; j<i ; j++) {

				if(i%j==0) {
					isPrime=false;
					break;

				}

			}
			//prime number
			
			if(isPrime)
				System.out.println(i +" ");
		}

	}}


