package Assignment_6;

import java.util.Scanner;

public class UppercaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		char ar[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(i==0) {
				int a = ar[i];
				a -= 32;
				ar[i] = (char)a;
			}
			else if(ar[i-1]==' ')
			{
				int a = ar[i];
				a -= 32;
				ar[i] = (char)a;
			}
		}
		for (char c : ar)
		{
			System.out.print(c);
		}
	}
}
