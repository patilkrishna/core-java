// /* 24.Write a program to search an element in the array.
class que24{
	
	public static void main(String abc[])
	{
		int arr[]={2,67,1,8,6,9};
		int search=8,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == search)
			{
				System.out.println(search +" : element Found at " +i+ " index" );
				count ++;
				break;
			}
			
		}
		if(count == 0)
		{
		System.out.println(search + " : element not found" );
		}
		
	}
}