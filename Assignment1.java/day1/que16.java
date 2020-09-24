/* 15.Accept person’s gender (character m for male and f for female), 
age (integer), as input and then check whether person is eligible for marriage or not. */
import java.util.Scanner;
class que16{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the gender for male M and for female F : ");
        int sex = sc.next().charAt(0);

        System.out.println("enter the age : ");
        int age = sc.nextInt();

        if(sex == 'F') 
        {
            if (age >= 18){
            System.out.println("Eligible for marriage");
            }
            else
            System.out.println("not Eligible");

        }
        else if (sex == 'M')
        {
             if (age >= 21){
            System.out.println("Eligible for marriage");
            }
            else
            System.out.println("not Eligible");
        }
        else
           System.out.println(" Not Eligible for marriage");



        
    }
}