import java.util.Scanner;
import java.lang.Math;

class MathOperation{

    static int add(int n1, int n2){
        return n1+n2;
    }

    static int substract(int n1, int n2){
        return n1-n2;
    }

    static int multiply(int n1, int n2){
        return n1*n2;
    }

    static double power(double n1, double n2){
        return Math.pow(n1,n2);
    }
}

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no's for Addition : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int addRes = MathOperation.add(n1,n2);
        System.out.println("Enter no's for Substraction : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int subRes = MathOperation.substract(a,b);
        System.out.println("Enter no's for multiply : ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int mulRes = MathOperation.multiply(c,d);
        System.out.println("Enter no's for power: ");
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double powRes = MathOperation.power(e,f);

        System.out.println("Addition : "+addRes);
        System.out.println("Substract : "+subRes);
        System.out.println("Multiplication : "+mulRes);
        System.out.println("Power : "+powRes);
    }
}