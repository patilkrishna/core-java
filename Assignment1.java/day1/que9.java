/* 09.Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.*/

import java.util.Scanner;
class que9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter days : ");
        int days = sc.nextInt();
        int rday ;
        int years = days/365;
        days = days%365;
        System.out.println("years are :" + years);
        int months = days/30;
        days = days%30;
        rday = days;
        System.out.println("months  are :" + months);
        System.out.println("remaining days are :" + rday);

        
            
    }
}