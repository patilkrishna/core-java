package Assignment_6;

import java.util.Scanner;

public class VowelsCount {

	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.nextLine();
		
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || 
					name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || 
					name.charAt(i)=='O' || name.charAt(i)=='U') {
				
				count++;
				
			}
		}
		
		System.out.println("No of vowels is : "+count);
	}

}
