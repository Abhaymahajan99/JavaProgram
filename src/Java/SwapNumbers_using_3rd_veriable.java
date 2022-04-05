package Java;

import java.util.Scanner;

public class SwapNumbers_using_3rd_veriable {

	public static void main(String[] args) {
		int x , y , temp;
		System.out.println("Enter the value of x and y");

		Scanner sc =new Scanner(System.in);

		x= sc.nextInt();

		y=sc.nextInt();

		System.out.println("Before Swaping "+x+ " " +y);
		
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swaping "+x+ " " +y);
	}

}
