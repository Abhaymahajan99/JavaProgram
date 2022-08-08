package Java;

public class Largest_element_in_an_array {


	//without method
	public static void main(String[] args) {
		int arr[]= {10,466,64,789,780,987};
		
			
			int max=arr[0];
			for(int i = 1; i< arr.length; i++) {
				if(arr[i]> max) 
					max = arr[i];
			}
				System.out.println(max);
			}}
			
	//With Method
	/*
	 * int arr[]= {10,466,64,789,780,987};
	 * 
	 * int Arraylength(){
	 * 
	 * int max=arr[0];
	 * 
	 * 
	 * for(int i = 1; i< arr.length; i++) { if(arr[i]> max) max = arr[i];
	 * 
	 * 
	 * } return max;
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * Largest_element_in_an_array a =new Largest_element_in_an_array(); int aa =
	 * a.Arraylength(); System.out.println(aa); }
	 * 
	 * }
	 */