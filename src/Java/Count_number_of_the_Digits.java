package Java;

import java.util.Scanner;

public class Count_number_of_the_Digits {

	public static void main(String[] args) {

		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleae Enter any number");
		num=sc.nextInt();
		
		
		while(num>0){
			
			num=num/10;
			count = count + 1;
			
		}
		System.out.println("Number of degits in given number: "+count);

	}

}
