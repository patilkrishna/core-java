import java.util.Scanner;
class que6{
    public static void main(String[] args) {
       
        System.out.print("enter radius : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float area = 2*3.14f*(r*r);
        float cirF = 2*3.14f*r;

        System.out.println("Area of circle : " + area);
         System.out.println("circumference of circle :"+ cirF);
        
    }
}