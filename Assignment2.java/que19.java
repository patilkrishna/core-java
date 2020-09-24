

import java.util.Scanner;
import java.lang.Math; 
class que19{
	public static void main(String abc[])
	{
		int i,res1=0;
		double res2=0;
	  Scanner sc=new Scanner(System.in);
	 
	 
	  System.out.println("Enter num");
	  int num=sc.nextInt();
	  for(i=1;i<=num;i++)
	  {
		res2 = res2 + Math.pow(i,2); 
	  }
	  res1=(int)(res2);
	  System.out.println("ans= "+res1);
	}
}