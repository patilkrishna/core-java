/* 08.Write a program to find the simple interest. Take the principle amount,
 rate of interest and time from user using Scanner class.*/
 import java.util.Scanner;
 class que8{
     public static void main(String[] args) {
         System.out.println("enter the principal : ");
         Scanner sc = new Scanner(System.in);
         int principal = sc.nextInt();
          System.out.println("enter the rate: ");
         int rate = sc.nextInt();
          System.out.println("enter the time : ");
         int time = sc.nextInt();
         int SI = (principal*rate*time)/100;
         System.out.println("simple intrest is : "+ SI);
         
     }
 }