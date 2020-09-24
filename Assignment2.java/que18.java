import java.util.Scanner;
class que18{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no : ");
        int no = sc.nextInt();
      
        int count = 0 ;

        for(int i=2;i<no;i++)
        {
         if( no % i == 0)
         {
             count++;
            
         }
         
        }
         if(count == 0)
             {
                 System.out.println(no+":no is prime");
             }
         else
         {
             System.out.println(no+" : not a prime no");
           
         }
          


        
    }
}