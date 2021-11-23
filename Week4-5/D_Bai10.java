package week4_5;

import java.util.Scanner;

public class D_Bai10 {
	public static void main(String[] args) {
		System.out.println("Le Phuong Anh 20183680");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array: ");
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		int lenMax = arr[0].length();
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i].length() >= lenMax) {
				lenMax = arr[i].length();
				temp = i;
			}
		}

		System.out.print("The longest string is: ");
		for (int i = 0; i < n; i++) {
			if (arr[i].length() == arr[temp].length()) {
				System.out.print(arr[i] + ", ");
			}
		}
		sc.close();
	}
}
