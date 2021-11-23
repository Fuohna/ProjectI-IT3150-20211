package week4_5;

import java.util.Scanner;

public class D_Bai12 {
	public static void main(String[] args) {
		System.out.println("Le Phuong Anh 20183680");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of the array: ");
		int n = sc.nextInt();
		sc.skip(System.lineSeparator());
		System.out.println("Enter the elements of array: ");
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isThi(arr[i]) == true) {
				count++;
			}
		}
		System.out.println("The number of people whose middle name is Thi is " + count);
		sc.close();
	}

	private static boolean isThi(String fullname) {
		fullname = fullname.trim();
		int indexOfName = 0;
		for (int i = fullname.length() - 1; i >= 0; i--) {
			if (fullname.charAt(i) == ' ') {
				indexOfName = i;
				break;
			}
		}
		int indexOfLastName = 0;
		for (int i = 0; i < fullname.length() - 1; i++) {
			if (fullname.charAt(i) == ' ') {
				indexOfLastName = i;
				break;
			}
		}
		String dem = fullname.substring(indexOfLastName + 1, indexOfName);
		if (dem.equals("Thi")) {
			return true;
		} else
			return false;
	}
}
