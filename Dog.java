package p1;

class Dog1 {
	public void dog() {
		System.out.println("Ankit Gadge");
	}
}

public class Dog {
	public static void main(String[] args) {
		Dog1 anki = new Dog1();
		anki.dog();
		int number = calculation(4, 3);
		System.out.println(number);
		int subtr = substraction(7, 4);
		System.out.println(subtr);
		int division = division1(7, 4);
		System.out.println(division);

	}

	static int calculation(int a, int b) {
		return a * b;

	}

	public static int substraction(int a, int b) {
		return a - b;
	}

	protected static int division1(int a, int b) {
		return a / b;

	}

}
