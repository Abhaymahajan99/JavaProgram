package Java;

import java.util.Scanner;

public class Nested_If_Else {

	public static void main(String[] args) {
		int PassingMarks;
		int MarksObtained;
		char grade;

		PassingMarks=40;
		System.out.println("Input marks score by you");
		Scanner sc=new Scanner(System.in);
		MarksObtained=sc.nextInt();

		if(MarksObtained>=PassingMarks) 
		{

			if(MarksObtained >= 90)

				grade='A';

			else if(MarksObtained >=70)

				grade='B';

			else if(MarksObtained >=60)

				grade='C';
			else
				grade='D';

			System.out.println("You Passed out and your grade is : "+ grade);

		}
		else {
			grade='F';
		System.out.println("You Faild and your grade is : "+ grade);

	}
}

}
