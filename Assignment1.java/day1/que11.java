/* 11.Write a program to swap two numbers without using third variable. */
import java.util.Scanner;
class que11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter x :");
        int x = s.nextInt();

        System.out.println("enter y :");
        int y = s.nextInt();
         
        
        x = x+y;
        y = x - y;
        x = x -y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
    }
}