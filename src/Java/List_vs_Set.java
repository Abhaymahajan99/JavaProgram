package Java;


import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class List_vs_Set {
		
	
	public static void main(String[] args) {
		
		
	
	Collection<String>  tester =new LinkedList<String>();

	tester.add("Abhay");
	tester.add("dilip");
	tester.add("Arun");
	tester.add("Nisarga");
	tester.add(null);
	tester.add("Abhay");
	tester.add("Sowmya");
	
	System.out.println("List :"+ tester);
	
	Collection<String>  Link =new HashSet<String>();

	Link.add("Abhay");
	Link.add("dilip");
	Link.add("Arun");
	Link.add("Nisarga");
	Link.add(null);
	Link.add("Abhay");
	Link.add("Sowmya");
	
	System.out.println("Set :"+ Link);

}
	}
