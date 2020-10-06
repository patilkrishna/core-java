import java.util.Scanner;

abstract class Processor{
    float data=1;
    float pi = 3.14f;
    void showData(){
        System.out.println("Data value : "+data);
    }
    abstract void process();
}

class Factorial extends Processor{
    void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no for finding factorial : ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++)
        {
           data = data * i;
        }
    }
}

class Circle extends Processor{
    void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int rad = sc.nextInt();
        data = 2*pi*rad;
    }
}

class AbstractDemo{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Enter your choice : ");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    Processor p = new Factorial();
                    p.process();
                    p.showData();
                    break;
            
                case 2:
                    Processor p1 = new Circle();
                    p1.process();
                    p1.showData();
                    break;

                default :
                    System.out.println("Invalid choice");
            }
        }
    }
}