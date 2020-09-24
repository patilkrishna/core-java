import java.util.Scanner;
class que15{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year : ");
        int year = s.nextInt();
         
        if (year%4==0)
        {
            System.out.println(year+" : is a leap year");

        }
        else
         System.out.println(year+" : is not a leap year");
    }

}