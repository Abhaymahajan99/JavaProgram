package Java;

import java.util.Scanner;

public class Palindrome_or_Not {
	
	public static void main(String[] args) {
		/*
		 * String name;
		 * 
		 * int i;
		 * 
		 * String rev = "";
		 * 
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * System.out.println("Enter name");
		 * 
		 * name = sc.nextLine();
		 * 
		 * int leng= name.length();
		 * 
		 * for(i= leng-1 ; i>=0 ; i--) {
		 * 
		 * rev=rev+name.charAt(i);
		 * 
		 * } if(name.equals(rev)) System.out.println("Is pelendrom"); else
		 * System.out.println("Is not pelendrom");
		 * 
		 * }
		 * 
		 * }
		 */
String name;
	int i;
	String rev="";
	int lenght;
System.out.println("Enter Name");

Scanner sc=new Scanner(System.in);

name = sc.nextLine();

lenght = name.length();

for(i=lenght-1;i>=0;i--)
{
rev=rev+name.charAt(i);

}
if(name.equals(rev)) 

System.out.println(rev + " is Pelendrom of " + name);

else

System.out.println(rev + " is not Pelendrom "+name);

}}