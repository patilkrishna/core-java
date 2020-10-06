package Assignment_6;

import java.util.Scanner;

public class WordCount {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		for (String str : ar) {
			count++;
		}
		System.out.println("Total words : "+count);
	}

}
