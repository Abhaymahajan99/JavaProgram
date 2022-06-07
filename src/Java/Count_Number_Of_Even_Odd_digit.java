package Java;

import java.util.Scanner;

public class Count_Number_Of_Even_Odd_digit {

	public static void main(String[] args) {
		
		int num ,rem;
		int OddCount=0 , EvenCount=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();

		while(num>0) {
			
			rem=num%10;
			if(rem%2==0)
				EvenCount++;
			else
				OddCount++;
			num=num/10;
		}
		System.out.println("OddCount is: "+OddCount);
		
		System.out.println("EvenCount is: "+EvenCount);
		
	
	}

}
