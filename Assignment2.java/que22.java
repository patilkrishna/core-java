/* 22.Sort a ten element array in descending order. */
import java.util.Scanner;
class que22{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the arr element");
        int arr[] = new int[5];
        int temp = 0;
        for(int i =0 ;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("arr elements in descending order : ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }/*
        for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr.length-1;j++)
		   {
			   if(arr[j] < arr[j+1])
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }				   
		   }
		   
	   }*/
        for(int array:arr)
        {
            System.out.println(array);
        }

    }
}