package Java;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayList {

	public static void main(String[] args) {

		Collection<String>  tester =new ArrayList<String>();

		tester.add("Abhay");
		tester.add("dilip");
		tester.add("Arun");
		tester.add("Nisarga");
		tester.add(null);
		tester.add("Abhay");
		tester.add("Sowmya");
		
		System.out.println("Tester Size : " +tester.size());
		
		System.out.println("CheckIsEmpty : " +tester.isEmpty());
		
		System.out.println("tester ArrayList :"+ tester);
		
		Collection<String>  Link =new ArrayList<String>();

		Link.add("Abhay");
		Link.add("dilip");
		Link.add("Arun");
		Link.add("Nisarga");
		Link.add(null);
		Link.add("Abhay");
		Link.add("Sowmya");
		
		System.out.println("Link :"+ Link);

		Collection<String>  dev =new ArrayList<String>();

		dev.add("Ravinder");
		dev.add("Akash");
		dev.add("Suman");
		dev.add("Rahul");
		dev.add("Ravinder");
		dev.add("Onkaar");

		System.out.println("dev :"+ dev);

		tester.addAll(dev);
		
		int size2 = tester.size();

		System.out.println("All : "+ size2);
		System.out.println("All Member :"+ tester);


	}

}
