/* 12.In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
 then HRA = 10% of basic salary and DA = 90% of basic salary.
  If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
  If the employee's salary is input by the user write a program to find his gross salary.
 [ formula : GS= Basic + DA + HRA ]*/

 import java.util.Scanner;
 class que12{
     public static void main(String args[]) {
      System.out.println("Enter your salary : ") ;
      Scanner sc = new Scanner(System.in);
      float sal = sc.nextInt();

      if(sal<10000)
      {
          float HRA=(sal*10) /100 ;
		  float DA=(sal*90)/100;
		  float GS=sal+DA+HRA;
		  System.out.println("Gross sal :  " +sal + " is " +GS );
      }
      else if (sal>=10000){
          float HRA=2000;
			float DA=(sal * 90)/100;
		    float GS= sal+DA+HRA;
			System.out.println("Gross sal : " +sal + " is " +GS );
      }
      else{
			
			System.out.println("Invalid sal" );
	}

     }
 }