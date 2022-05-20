package Java;

public class thisKeywords {

	String name = "Abhay";
	int age =26;
	
	public static void main(String[] args) {
		thisKeywords k = new thisKeywords();
		k.display();
		k.office();
		
	}

	void display(){
		String name="Ravinder";
		int age = 24;
		System.out.println("Name 1 : " + name);
		System.out.println("Age  1: "+ age);
	}
	
	void office() {
		
		String name="Dillp";
		int age = 23;
		System.out.println("Name 2 : " + name);
		System.out.println("Age 2 : "+ age);
		
		System.out.println("Name 3: " + this.name);
		System.out.println("Age 3: "+ this.age);
	}
	
	
	
	
}
