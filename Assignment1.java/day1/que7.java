/* 07.Write a program to calculate sum of 5 subject’s marks & find percentage.
 Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ].
 Use concatenation operator here.*/

 import java.util.Scanner;
 class que7{
     public static void main(String args[]) {

        System.out.println("enter your marks : ");
         Scanner sc = new Scanner(System.in);
          float res = 0;
        for(int i =0;i<5 ;i++)
        {
            int submarks = sc.nextInt();
           
            res = (res + submarks);
        }
         res = (res/5);
        System.out.println("percentage marks =  "+res+"%");

         
     }
 }