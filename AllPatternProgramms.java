package p2;

public class AllPatternProgramms {
	public static void main(String[] args) {
		System.out.println("Program for Inverted Right Angle Triangle");
		int b = 7;
		int v = 0;
		for (int i = 0; i <= b; i++) {
			for (int j = 1 + i; j <= b; j++) {

				System.out.print(j + " ");

			}

			System.out.println();
		}

		System.out.println("Program for Inverted Triangle");
		for (int i = 0; i <= b; i++) {
			for (int s = 0; s < b + i; s++) {
				System.out.print(" ");
			}
			for (int j = 1 + i; j <= b; j++) {

				System.out.print(j + " ");

			}

			System.out.println();
		}
//		/////////////////////////////
		int length = 5;
		System.out.println("Program for Pyramid Program");
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length - j; i++) {
				System.out.print(" ");
			}
			for (int a = j; a >= 0; a--) {
				System.out.print("*" + " ");
			}

			System.out.println("");
		}
		System.out.println("Program for Right Triangle Star Pattern");
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < j + 1; i++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");

		}
		System.out.println("Program for  Left Triangle Star Pattern");
		for (int j = 0; j <= length; j++) {
			for (int i = 1; i <= length - j; i++) {
				System.out.print(" " + " ");
			}
			for (int a = 0; a <= j; a++) {
				System.out.print("*" + " ");

			}
			System.out.println(" ");
		}

		System.out.println("Program for Right Pascal’s Triangle");

		for (int i = 0; i <= length - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (int i = length - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		System.out.println("Program for  Downward Triangle Star Pattern");

		for (int i = 0; i < length; i++) {
			for (int j = length - i; j > 0; j--) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}

		System.out.println("Program for   Reversed Pyramid Star Pattern");

		for (int i = 0; i < length; i++) {
			for (int a = 0; a <= i; a++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= length - i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
		System.out.println("Program for   Right down Mirror Star Patter");
		for (int i = 0; i < length; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= length - i; a++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		System.out.println("Program for   Left  Triangle Pascal’s");
		for (int i = 0; i <= length - 1; i++) {
			for (int j = 0; j <= length - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*" + "");
			}
			System.out.println("");
		}
		for (int i = 0; i < length; i++) {

			for (int k = 1; k <= i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < length - i; j++) {
				System.out.print("*" + "");
			}
			System.out.println("");
		}
		System.out.println("Program for   Sandglass Star Pattern");
		for (int i = 0; i <= length - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= length - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= length - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Program for   Alphabet A Pattern");
		for (int i = 1; i <= length; i++) {
			if (i == 1 || i == length)
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			else {
				for (int j = 1; j <= i; j++) {
					if (j == 1 || j == i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				if (j == 1 || j == length)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("Program for   Triangle Star pattern");
		for (int i = 1; i <= length; i++) {
			for (int j = i; j < length; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * i; k++) {
				if (i == length || (k == 1 || k == 2 * i - 1))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("Program for   Down triangle");
		for (int i = length; i >= 1; i--) {
			for (int j = length; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * i; k++) {
				if (i == length || (k == 1 || k == 2 * i - 1))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("Printing Hollow Diamond Star Pattern");

		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = length - 1; i > 0; i--) {
			for (int j = 1; j <= length - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
