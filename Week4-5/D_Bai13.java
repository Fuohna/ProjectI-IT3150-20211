package week4_5;

import java.util.Scanner;

public class D_Bai13 {
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
			if (isNameStartWithH(arr[i]) == true) {
				count++;
			}
		}
		System.out.println("The number of people whose name is start wwith 'H' is " + count);
		sc.close();
	}

	private static boolean isNameStartWithH(String fullname) {
		fullname = fullname.trim();
		int indexOfName = 0;
		for (int i = fullname.length() - 1; i >= 0; i--) {
			if (fullname.charAt(i) == ' ') {
				indexOfName = i;
				break;
			}
		}

		String name = fullname.substring(indexOfName + 1, fullname.length());
		if (name.startsWith("H")) {
			return true;
		} else
			return false;
	}

}
