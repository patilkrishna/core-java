/* print the table of any given no */
import java.util.Scanner;
class que16{
    public static void main(String[] args) {

        System.out.println("enter the no : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        System.out.println("table of : "+no);
        for(int i = 1;i<=10;i++)
        {
            int res = 0;
            res = no*i;
            System.out.println(res);
        }
        
    }
}