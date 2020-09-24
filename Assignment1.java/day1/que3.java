/*  03.Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]03.Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]*/

import java.util.Scanner;
class que3{
    public static void main(String[] args) {
        System.out.println("enter the value of x : ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       
        int y = (x*x) + (3*x) -7;
        System.out.println("value of y = "+y);
        y = x++ + ++x;
        System.out.println("value of y = "+y);
        System.out.println("value of x ="+x);

        int z = x++ - --y - --x + x++;
        System.out.println("value of x = "+x);
        System.out.println("value of y = "+y);
        System.out.println("value of z = "+z);
        boolean a = true ,b = false;
        boolean c = a &&  b || !(a || b);

        //System.out.println("value of x = "+x);
        //System.out.println("value of y = "+y);
        System.out.println("value of c = "+c);
       
        
    }
}