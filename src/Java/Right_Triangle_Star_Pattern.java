package Java;

public class Right_Triangle_Star_Pattern {

	public static void main(String[] args) {
		int x , y,row = 5;
		
		for(x=0 ; x<row ; x++) {
			
			for( y= 2*(row-x) ; y>=0 ;y--) {
				System.out.print(" ");
			}
			for( y=0 ; y<=x ; y++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
