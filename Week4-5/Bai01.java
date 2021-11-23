package week4_5;

import java.util.Scanner;

public class D_Bai01 {
	public static void main(String[] args) {
		String str = "   Le    Phuong Anh               ";
		System.out.println("String:" + str);
		System.out.println("String after clearing excessive whitespace:");
		System.out.println(str.replaceAll("\\s\\s+", " ").trim());
	}
}
