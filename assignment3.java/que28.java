/* 28.	Initialize one String type of array and print the elements using for each loop. */
import java.util.Scanner; 
class que28{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the size:");
		int size = sc.nextInt();
		String str[]=new String[size];
		System.out.println("enter the  string element : ");
		for(int i=0;i<str.length;i++)
		{
			
			
			str[i]=sc.next();
        }
        System.out.println("string elements are : ");
        for(String arr:str)
        {
            
			System.out.println(arr);
        }
		
	}
}