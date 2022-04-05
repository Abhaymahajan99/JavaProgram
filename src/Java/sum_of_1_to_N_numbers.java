package Java;

import java.util.Scanner;

public class sum_of_1_to_N_numbers {
	
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		 Scanner sc = new Scanner(System.in);
			
		 int n= sc.nextInt();
		 int sum=0;
		 
		 for(int i=1 ; i<=n ; i++)
		 {
			 sum=sum+i;
		 }
		 
		 System.out.println("Sum of numbesrs : "+sum);
	}

}
