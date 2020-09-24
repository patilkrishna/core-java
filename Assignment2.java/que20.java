/* Print all prime numbers between two given numbers. [ break continue] */
/*import java.util.Scanner;
class que20{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range  starting no : ");
        int no1 = sc.nextInt();
        System.out.println("enter the range ending no : ");
        int no2 = sc.nextInt();
        int count = 0;
        for(int i = no1;i<no2;i++)
        {
          if (i==1||i==2)
             continue;

          count=1 ;
          for(int j=2;j< i/2;j++)
          {
              if(i % j == 0)
              {
                  count = 0;
                  break;
              }
          }
          if(count == 0)
          {
              System.out.println(i+" : prime no");
          }
        }
    }
}*/

  
// 20.	Print all prime numbers between two given numbers. [ break continue ]
import java.util.Scanner;
class que20{
	public static void main(String abc[])
	{
		int i,j,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int first=sc.nextInt();
		System.out.println("Enter last num");
		int last=sc.nextInt();
		outer:
		for(i=first;i<=last;i++)
		{
			if(i == 1 || i == 0)
				continue;
			c=1;
			
			for(j=2;j<=i/2;j++)
			{
				if(i % j == 0)
				{
					c=0;
					break;
				}
				
			}
           			
	   
	   if(c == 0)
		{
			System.out.println( i + " is not a  prime num");
		}
		
		}
		
	}
}
