package Java;

	public class Honda4 extends bike{
		void run()
		{
		System.out.println("running safely");
		}
		
		void speed() {
			
			System.out.println("40 KM/H");
		}
		
		public static void main(String args[]){
			
		bike obj = new Honda4();
		
		obj.run();
		
		obj.speed();
		
		}
		

}
