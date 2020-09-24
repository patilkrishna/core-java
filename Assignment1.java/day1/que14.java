import java.util.Scanner;
class que14{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" enter the no1 : ");

        int a = s.nextInt();
        System.out.println(" enter the no2 : "); 
        int b = s.nextInt();
        System.out.println(" enter the no3 : ");
        int c = s.nextInt();
        int d = (a>b) ? (a > c ? a : c) : (b>c?b:c);
         System.out.println("greatest no is : "+d);
   


        
    }

}