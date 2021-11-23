package week4_5;

import java.util.Scanner;

public class D_Bai06 {
	public static void main(String[] args) {
		System.out.println("Le Phuong Anh 20183680");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		StringBuilder strBuilder = new StringBuilder(str);
		String strReversed = strBuilder.reverse().toString();
		System.out.println("The string after reversed: " + strReversed);
		
		sc.close();
	}
}
