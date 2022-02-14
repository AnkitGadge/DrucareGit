package p1;

import java.util.Scanner;

import com.sun.glass.ui.SystemClipboard;

import javafx.scene.chart.StackedAreaChart;

//class Dog1 {
//	public void dog() {
//		System.out.println("Ankit Gadge");
//	}
//}

public class Dog {
	public static void main(String[] args) {
//		Dog1 anki = new Dog1();
//		anki.dog();
//		int number = calculation(4, 3);
//		System.out.println(number);
//		int subtr = substraction(7, 4);
//		System.out.println(subtr);
//		int division = division1(7, 4);
//		System.out.println(division);
//
//	}
//
//	static int calculation(int a, int b) {
//		return a * b;
//
//	}
//
//	public static int substraction(int a, int b) {
//		return a - b;
//	}
//
//	protected static int division1(int a, int b) {
//		return a / b;

//		System.out.println("================");
//		String str = "Ankit    Gadge";
//		String strtrim = str.replaceAll("\\s", "");
//		int count = 0;
//		char[] strArray = strtrim.toCharArray();
//		for (char i : strArray) {
//			count++;
//		}
//		System.out.println(count);
//		System.out.println("=======================");
//		String numbers = "Nature is very Beautiful";
//		String str1 = numbers.replaceAll("\\s", "");
//		char[] strArray = str1.toCharArray();
//		int count = 0;
//		int count1 = 0;
//		for (char i : strArray) {
//			if (i == 'a' || i == 'A' || i == 'e' || i == 'E' || i == 'i' || i == 'I' || i == 'o' || i == 'O' || i == 'u'
//					|| i == 'U') {
//				count++;
//			} else {
//				count1++;
//			}
//
//		}
//		System.out.println("Number of Vowels are " + count);
//		System.out.println("Number of consonents are " + count1);
		StringBuffer str=new StringBuffer();
		Scanner scn=new Scanner(System.in);
		
		String string=scn.next();
		int ln=string.length();
		for(int i=0;i<ln;i++) {
			Character c=string.charAt(i);
			if(Character.isLowerCase(c))
			    str.replace(i, i, Character.toUpperCase(c)+"");
			else
				str.replace(i, i, Character.toLowerCase(c)+"");
		}
		System.out.println(str);
		//
//String   java="java";
//System.out.println(java.toUpperCase());
//String Java="JAVA";
//System.out.println(Java.toLowerCase());

//		int a = 1;
//		if (a % 2 == 0) {
//			System.out.println(a + " Is a  not prime number");
//		} else {
//			System.out.println(a + " Is  a prime number");
//		}

//		int b = 7;
//		int v = 0;
//		for (int i = 0; i <= b; i++) {
//			for (int j = 1+i; j <= b; j++) {
//
//				System.out.print(j+" ");
//
//			}
//
//			System.out.println();
//		}
//		for (int i = 0; i <= b; i++) {
//			for (int s = 0; s < b+i; s++) {
//				System.out.print(" ");
//			}
//			for (int j = 1 + i; j <= b; j++) {
//
//				System.out.print(j + " ");
//
//			}
//
//			System.out.println();
//		}

	}

}
