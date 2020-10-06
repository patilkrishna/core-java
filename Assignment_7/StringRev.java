package Assignment_6;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=sc.nextLine();
		char ar[]=new char[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			ar[i]=s.charAt(s.length()-1-i);
		}
		for(char c:ar)
		{
			System.out.print(c);
			
		}
	}
}
