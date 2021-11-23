package week4_5;

import java.util.Scanner;
import java.util.Stack;

public class D_Bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String fullname = sc.nextLine();

		fullname = fullname.trim();
		int indexOfName = 0;
		for (int i = fullname.length() - 1; i >= 0; i--) {
			if (fullname.charAt(i) == ' ') {
				indexOfName = i;
				break;
			}
		}
		String name = fullname.substring(indexOfName + 1, fullname.length());
		System.out.println("Your name is " + name);

		sc.close();
	}
}
