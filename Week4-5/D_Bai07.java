package week4_5;

import java.util.Scanner;

public class D_Bai07 {
	public static void main(String[] args) {
		System.out.println("Le Phuong Anh 20183680");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				str = str.replace(str.charAt(i), '$');
			} else
				continue;
		}
		System.out.println("Result: " + str);

		sc.close();
	}
}
