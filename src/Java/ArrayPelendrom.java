package Java;
import java.util.Arrays;

public class ArrayPelendrom {
	
	public static void main(String[] args) {
		
		 String arr[] = { "abc", "bc84d", "dca"};	
		 
		int leng = arr.length;
		
		System.out.println("Input array "+Arrays.toString(arr));
		for(int i=leng-1 ; i>=0 ; i-- ) {
			//System.out.println("string --- "+arr[i]);
			int strLen = arr[i].length();
			String rev = "";
			for(int j=strLen-1; j>=0; j--) {
				//System.out.println("string character --- "+arr[i].charAt(j));
				rev=rev + arr[i].charAt(j); 
				
			}
			 
			arr[i] = rev;
		}
		
		System.out.println("Reversed array "+Arrays.toString(arr));
		
		
	
		}

	}


