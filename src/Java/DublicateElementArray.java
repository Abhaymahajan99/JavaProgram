package Java;

import java.util.HashSet;

public class DublicateElementArray {

	public static void main(String[] args) {

   String arr[]= {"java","java","C++","C","Ruby","PHP"};
    
    boolean falg = false;
    for(int i=0;i<=arr.length;i++) 
    {
    	
    	for(int j=i+1 ;j<arr.length;j++) 
    	{
    		if(arr[i]==arr[j])
    		{
    			System.out.println("Dublicate element is  "+arr[i]);
    			falg=true;
    		}
    	}
    }
    
    if(falg==false) {
    	System.out.println("Not fount any dublcate element");
    }

	

		String arr2[]= {"java","java","C++","C++","Ruby","PHP"};
		boolean flag = false;
		HashSet<String> length = new HashSet();
		
		for(String s: arr2) 
		{
			if(length.add(s)==false) {
				
				System.out.println(s);
			}
		}
}

}

