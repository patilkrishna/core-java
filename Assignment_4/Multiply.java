import java.util.Scanner;
class MathOperation{

    static void multiply(int n1, int n2){
        int res = n1*n2;
        System.out.println("Multiplication : "+res);
    }

    static void multiply(float n1, float n2, float n3){
        float res = n1*n2*n3;
        System.out.println("Multiplication : "+res);
    }

    static void multiply(int arr[]){
        int product = 1;
       for (int i=0; i<arr.length;i++){
           product = product * arr[i];
       }
       System.out.println("Multiplication is = "+product);
    }

    static void multiply(double n1, int n2){
        double res = n1*n2;
        System.out.println("Multiplication : "+res);
    }
}

class Multiply{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        System.out.println("Enter elements of array : ");

        for (int i=0; i<arr.length;i++){
           arr[i] = sc.nextInt();
        }
        MathOperation.multiply(10,20);
        MathOperation.multiply(10,20,10);
        MathOperation.multiply(arr);
        MathOperation.multiply(10.565, 10);
         }
}