package Java;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Count of series");
		int count = sc.nextInt();

		int a =0 , b = 1 , c ;

		System.out.print(a+ " " +b);

		for (int i=2 ; i<=count ; i++) {

			c= a+b;

			System.out.print(" "+c);

			a=b;
			b=c;

		}
	}

}
