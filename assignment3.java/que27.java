/* 27.Write a program to fine the smallest and greatest number present in the array of integer type.*/
import java.util.Scanner;
class que27{
   
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter size of array : ");
	   int size = sc.nextInt();
       int arr[] = new int[size];
       int temp;
       System.out.println("Enter array elements : ");
	   for(int i=0;i<arr.length;i++)
	   {
		 
		   arr[i]=sc.nextInt();
	    }
		   
		  
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr.length-1;j++)
			 {
				if(arr[j] > arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}					
			 }
		 }
		 System.out.println("Smallest num : " + arr[0]);
		 System.out.println("Greatest num : " + arr[size-1]);
		 
			 
  }
}