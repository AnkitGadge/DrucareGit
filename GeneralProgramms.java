package p2;

public class GeneralProgramms {
	public static void main(String[] args) {

		System.out.println("=======================");
		System.out.println("Program for to remove the White spaces in the String 'Ankit Gadge'");

		String str = "Ankit    Gadge";
		String strtrim = str.replaceAll("\\s", "");
		int count2 = 0;
		char[] strArray1 = strtrim.toCharArray();
		for (char i : strArray1) {
			count2++;
		}
		System.out.println(count2);
		System.out.println("=======================");
		System.out.println("String is 'Nature is very Beautiful'");
		String numbers = "Nature is very Beautiful";
		String str1 = numbers.replaceAll("\\s", "");
		char[] strArray = str1.toCharArray();
		int count = 0;
		int count1 = 0;
		for (char i : strArray) {
			if (i == 'a' || i == 'A' || i == 'e' || i == 'E' || i == 'i' || i == 'I' || i == 'o' || i == 'O' || i == 'u'
					|| i == 'U') {
				count++;
			} else {
				count1++;
			}

		}
		System.out.println("Number of Vowels are " + count);
		System.out.println("Number of consonents are " + count1);
		StringBuffer str2 = new StringBuffer();
		System.out.println("================================");
		System.out.println("Program for Converting Upper To Lower Case and Lower to Upper Case");
		String string = "Nature is Very Beautiful";
		int ln = string.length();
		for (int i = 0; i < ln; i++) {
			Character c = string.charAt(i);
			if (Character.isLowerCase(c))
				str2.replace(i, i, Character.toUpperCase(c) + "");
			else
				str2.replace(i, i, Character.toLowerCase(c) + "");

		}
		System.out.println(str);
		System.out.println("================================");
		System.out.println("Program to UpperCase and LowerCase");
		String java = "java";
		System.out.println(java.toUpperCase());
		String Java = "JAVA";
		System.out.println(Java.toLowerCase());
		System.out.println("================================");
		System.out.println("Program to check the Prime Number");

		int temp;
		boolean isPrime = true;
		int num = 11;
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

	}

//	  GeneralProgramms ss= ()->n*n;
//	  ss.aa(10,20);

}
