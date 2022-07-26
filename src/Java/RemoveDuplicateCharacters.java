package Java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

	    String str="abhaaay";

	    //Aproch 1
		StringBuilder sb = new StringBuilder();

		Set<Character> set = new LinkedHashSet();
		
		for(int i=0; i<str.length();i++){
			
			set.add(str.charAt(i));
			
		}
		
		for(Character c: set) {
			
			sb.append(c);
		}

		System.out.println(sb);
		
	    //Aproch 2
		StringBuilder sb2 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb2.append((char)c));
		System.out.println(sb2);
	
}

}
