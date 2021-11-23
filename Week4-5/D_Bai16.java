package week4_5;

import java.util.Scanner;

public class D_Bai16 {
	public static void main(String[] args) {
		System.out.println("Le Phuong Anh 20183680");

		Scanner sc = new Scanner(System.in);
		System.out.print("Source string - S1: ");
		String str1 = sc.nextLine();
		System.out.print("Sentence - S2: ");
		String str2 = sc.nextLine();
		System.out.print("The number of occurrences " + str2 + " in " + str1 + " is: ");
		
		if(numberOfOccurrences(str1, str2) > 0) {
			System.out.println(str2 + " is substring of " + str1);
		}
		sc.close();
	}

	public static int numberOfOccurrences(String source, String sentence) {
		int occurrences = 0;

		if (source.contains(sentence)) {
			int withSentenceLength = source.length();
			int withoutSentenceLength = source.replace(sentence, "").length();
			occurrences = (withSentenceLength - withoutSentenceLength) / sentence.length();
		}

		return occurrences;
	}
}
