/* 17.Write a program to reverse a given number. */
import java.util.Scanner;
class que17{
    public static void main(String[] args) {

        System.out.println("enter the no : ");
        Scanner s = new Scanner(System.in);

        int no = s.nextInt();
         int remainder;
         int rev = 0;
         while(no != 0 )
         {
           remainder = no % 10;
           rev = rev * 10 + remainder;
           no = no/10;

         }
         System.out.println("rev no is : "+rev);
         
        
    }
}