/* 10.Write a program to convert temperature from Fahrenheit to Celsius.
 Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]*/

import java.util.Scanner;
class que10{
    public static void main(String[] args) {
    
        System.out.println("enter the temp in fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        int fahrenheit = sc.nextInt();
        float Celsius = 5*(fahrenheit - 32) /9;
        System.out.println("temp in celsius : "+Celsius);

    }
}