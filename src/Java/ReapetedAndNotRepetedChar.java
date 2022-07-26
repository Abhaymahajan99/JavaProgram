package Java;

import java.util.Scanner;

public class ReapetedAndNotRepetedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner input =new Scanner(System.in); 
//		System.out.print("Enter the String : ");
		
		String inputStr= "AABBDDDwO";
		String non_repeating = "";
		String repeating = "";
		
		char character;
		for(int i=0; i<inputStr.length(); i++) {
			character = inputStr.charAt(i);
			ReapetedAndNotRepetedChar g = new ReapetedAndNotRepetedChar();
			repeating = g.isNonRepeating(repeating, character);
		}
		
	}
	
	
	public String isNonRepeating(String str, char character) {
		char element;
		
		if(str.length() > 0) {
			for(int i=0; i<str.length(); i++) {
				element = str.charAt(i);
				System.out.print("Enter the String : "+element);
				if(element == character) {
					str = str + character;
				}
				
			}
             
			return str;
//			return true;
		}else {
			return str;
//			return false;
		}
		
	}
		

}
