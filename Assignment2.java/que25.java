
/* 25.Write the program to find the sum of even elements and sum of odd elements present in the array of integer type */

class que25{
	
	public static void main(String[] args)
	{
		int sum=0,sum1=0;
		int array[]=new int[]{2,1,3,5,4,7,11,9,};
		for(int i=0;i<array.length;i++)
		{
			if(array[i] % 2 == 0 )
			{
				sum = sum + array[i];
			}
			else
			{
				sum1 = sum1+array[i];
			}
		}
		System.out.println("sum of even num is : " + sum);
		System.out.println("sum of odd num is  : " + sum1);
	}
} 