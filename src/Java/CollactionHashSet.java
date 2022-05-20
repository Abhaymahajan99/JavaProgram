package Java;

import java.util.Collection;
import java.util.HashSet;

public class CollactionHashSet {

	public static void main(String[] args) {
		
		Collection<String> tester = new HashSet<String>();
		
		tester.add("Abhay");
		tester.add("dilip");
		tester.add("Arun");
		tester.add("Sowmya");
		tester.add(null);
		tester.add("Nisarga");
		tester.add("Abhay");
		tester.add("Sowmya");
		
		System.out.println("Tester witout duplicate :" +tester);

	}

}
