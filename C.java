package p2;

import java.util.Arrays;
import java.util.Scanner;
//import java.lang.Math.pow;

public class C {

	public static void main(String... args) {

		int a1 = 2, b = 4, c = 6;
		System.out.print(a1);
		System.out.print(" " + b);
		System.out.println(" " + c);

		System.out.println();
		System.out.println("." + " " + "j" + " " + "a" + " " + "v" + " " + "a");
		int a = 9;
		a++;
		System.out.println(a);// 10
		a--;
		System.out.println(a);// 9
		++a;
		System.out.println(a);// 10
		System.out.println(a++);// 10
		System.out.println(a--);// 11
		System.out.println(--a);// 9
		System.out.println(++a);// 10

		String word = "java";
		String Word = " comp";
		String wordw = "java string";
		String word12 = "java string";
		String word123 = "java string";
		String in = "java";
		String java = "java";
		String symbol$ = "100 dollars";
		String word2 = "java";
		String word22 = " comp";
		String word_ = "java";
		String wordqq = "java is here";
		String capital = "delhi";

		String str = "  Pankaj SiR AcadeMy";

		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.trim().charAt(0));
		System.out.println(str.startsWith("  P"));
		System.out.println(str.endsWith("y"));
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		char[] i = { 'a' };
		String str1 = String.valueOf(i);
		System.out.println(str1);
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.toString());
		
		/*
		 * try { } // System.out.println("Print"); catch (Exception e) {
		 * 
		 * } // System.out.println("Ankit"); // catch( AirthmeticException e) {}; try {
		 * try { } catch (Exception e) { }
		 * 
		 * finally { } } catch (Exception e) { }
		 */
		System.out.println("===============================");
		System.out.println("Program to Write Java");
		System.out.println("j" + " " + "a" + " " + "v" + " " + "a");
		System.out.println("===============================");
		System.out.println("Program to trim the String 'Ankit Gadge'");
		String arr = " Ankit gadge";
		 System.out.println(arr.replaceAll(" ", ""));
	
		System.out.println("===============================");
		System.out.println("Program to find the length of the string");
		String arr2 = "Loremlpsum";
		System.out.println(arr2.length());
		System.out.println("===============================");
		System.out.println("Program to convert to lower case");
		String S = "ABCddE";
		
		String s2 = "LMNOppQQ";

	
		
		System.out.println(S.toLowerCase());
		System.out.println("===============================");
		System.out.println("Program for concatinating of String");
		System.out.println(S.concat(s2));

		System.out.println("===============================");
		System.out.println("Program to write float values in next line ");
		System.out.printf("2.3" + "\n" + "4.5" + "\n" + "7.8");
		System.out.println(" ");

		System.out.println("===============================");
		System.out.println("Program for increament and decreament");
		int i1 = 1;
		System.out.println(2 * (i1) + " " + 2 * (++i1) + " " + 2 * (++i1));
//		System.out.println("===============================");
//		System.out.println("Program to get the cube of a number");
//		double f = Math.pow(2, 3);
//		System.out.println(f);
		System.out.println("===============================");
		System.out.println("Program to find the Area of Triangle");
		int length = 2, breadth = 3;
		System.out.println(length * breadth);


		System.out.println("===============================");
		System.out.println("Program to find the leap year");
		System.out.println("Entered Leap year 1996");
		int year = 1996;

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Y");
		else
			System.out.println("N");
		System.out.println("===============================");
		System.out.println("Program for to find the smallest Number");
		int num1 = 20, num2 = 35;
		if (num1 > num2) {
			System.out.println(num2);
		} else {
			System.out.println(num1);
		}
		System.out.println("===============================");
		System.out.println("Program to check the vowel");
		char ch = 'i';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is consonant");
		System.out.println("===============================");
		System.out.println("Program for multiplier of 9");
		int input = 8;
		for (int s = 1; s <= input; s++) {
			System.out.print(9 * s + " ");
		}
		System.out.println("");
		System.out.println("===============================");
		System.out.println("Program for divisibility by 2");
		int even = 10;
		for (int v = 1; v <= even; v++) {
			if (v % 2 == 0) {
				System.out.print(v + " ");
			}

		}
		System.out.println();
		System.out.println("===============================");
		System.out.println("Program for Decreasing Number");
		int length1 = 6;
		for (int u = length1; u >= 1; u--) {
			System.out.print(u + " ");
		}
		System.out.println();
		System.out.println("===============================");
		System.out.println("Program for the right Angle Triangle");
		int rows = 5;
		String st = "";

		for (int h = 1; h <= rows; ++h) {
			for (int j = 1; j <= h; ++j) {
				st += "*";
			}
			st += "\n";
		}
		System.out.println(st);

		System.out.println("Programm of Palindrome");
		String string = "Ankit", reverseStr = "";

		int strLength = string.length();

		for (int z = (strLength - 1); z >= 0; --z) {
			reverseStr = reverseStr + string.charAt(z);
		}

		if (string.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(string + " is a Palindrome String.");
		} else {
			System.out.println(string + " is not a Palindrome String.");
		}
//
		System.out.println("===============================");
		System.out.println("Programm for reverse the String");
		String string1 = "Ankit Gadge";
		String reversedStr = "";

		for (int r = string1.length() - 1; r >= 0; r--) {
			reversedStr = reversedStr + string1.charAt(r);
		}

		System.out.println("Original string: " + string1);
		System.out.println("Reverse of given string: " + reversedStr);
		System.out.println("===============================");
		System.out.println("Anagram");
		String str3 = "Race";
		String str2 = "Care";
		str3 = str3.toLowerCase();
		str2 = str2.toLowerCase();
		if (str3.length() == str2.length()) {
			char[] charArray1 = str3.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result) {
				System.out.println(str3 + " and " + str2 + " are anagram");
			} else {
				System.out.println(str3 + " and " + str2 + " are not anagram");
			}

		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}

	}

}
