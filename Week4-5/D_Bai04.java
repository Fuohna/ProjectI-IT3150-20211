package week4_5;

import java.util.Scanner;
import java.util.Stack;

public class D_Bai04 {
	public static void main(String[] args) {
		System.out.println("Le Phuong Anh 20183680");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String fullname = sc.nextLine();

		fullname = fullname.trim();
		int indexOfLastName = 0;
		for (int i = 0; i < fullname.length() - 1; i++) {
			if (fullname.charAt(i) == ' ') {
				indexOfLastName = i;
				break;
			}
		}
		String lastname = fullname.substring(0, indexOfLastName);
		System.out.println("Your last name is " + lastname);

		sc.close();
	}
}
