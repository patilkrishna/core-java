/* 21.Program to show sum and average of 10 element array. Accept array elements from user. */
import java.util.Scanner;
class que21{
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        int array[] = new int[10];
        int sum = 0;
        float avg = 0f;
        
        System.out.println("enter the array elements : ");

        for(int i =0; i<array.length;i++)
        {
            array[i] = arr.nextInt();
            sum = sum +array[i] ;
            avg = sum / 10;
        }
       
       System.out.println("Sum of array elements is : "+sum);
       System.out.println("Avarage of array elements is : "+avg);
        
    }
}
