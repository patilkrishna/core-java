package Assignment_6;

import java.util.Scanner;

public class RevEveryWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String str[] = s.split(" ");
		for(String str1 : str) {
			for (int i = 0; i < str1.length(); i++) {
				char c = str1.charAt(str1.length()-1-i);
				System.out.print(c);
			}
			System.out.print(" ");
		}

	}

}
