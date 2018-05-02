package lesson;

public class numCalc{
	
	public static void main(String[] args) {
		System.out.println("Salam");
		int numA = 10;
		int numB = 20;
		name();
		sum(numA, numB);
		System.out.println(mult(numA, numB));
	}
	
	static void name() {
		System.out.println("My name is 3abdo LLah");
		System.out.println("Alyam ahmado LLah " + mult(200000000, 100000000) + " wakolla marra");
		System.out.println("Wasalla LLaho 3ala habibina \nMohammed " + mult(200000000, 100000000) + " wakolla marra");

	}
	static void sum(int numA, int numB) {
		int total = numA+ numB;
		System.out.println("The sum of " + numA + " and " + numB + " is: " + total );
	}
	
	static int mult(int numA, int numB) {
		int product = numA * numB;
		//sum(product, product);
		return product;
	}
	
}