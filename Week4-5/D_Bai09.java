package week4_5;

import java.util.Scanner;

public class D_Bai09 {
	public static void main(String[] args) {
		System.out.println("Le Phuong Anh 20183680");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string S: ");
		String str = sc.nextLine();
		
		int i = 0, j = 0;
		System.out.print("Enter i & j: ");
		i = sc.nextInt();
		j = sc.nextInt();

		char temp;
		temp = str.charAt(i);
		System.out.println(str);

		str = str.replace(str.charAt(i), str.charAt(j));
		System.out.println(str);

		str = str.replace(str.charAt(j), temp);
		
		System.out.println(str);
	}
}
