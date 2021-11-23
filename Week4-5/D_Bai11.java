package week4_5;

import java.util.Scanner;

public class D_Bai11 {
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
		for(int i=0; i<n; i++) {
			if(arr[i].endsWith("An") == true || arr[i].endsWith("an") == true
			   || arr[i].endsWith("aN") == true || arr[i].endsWith("AN") == true) {
				count++;
			}
		}
		System.out.println("The number of people named An is " + count);
		sc.close();
	}
}
