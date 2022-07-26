package Java;

public class RemoveCharFromString {

	public static void main(String[] args) {


		String str = "i work at amazon.";
		
		String replace = str.replaceAll("[^bcdfghjklmnpqrstvwxyz]", " ");
		
		System.out.println(replace);

	}

}
