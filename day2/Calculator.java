package week2.day2;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator casio = new Calculator();
		int addition = casio.add(20,10);
		int subtraction = casio.sub(20,10);
		
		System.out.println(addition);
		System.out.println(subtraction);
		
		
	}
		
				
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
		

	}
	

	

}

		
	
