import java.util.Scanner;
interface Taxable{
    float salesTax = 7f;
    float incomeTax = 10.5f;
    void calcTax();
}
class Employee implements Taxable{
    private int empId;
    private String empName;
    private int salary;

    Employee(int empId,String empName,int salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }

    public void calcTax(){
        float empIncomeTax = salary * incomeTax/100;
        System.out.println("Income Tax : "+empIncomeTax);
    }
}
class Product implements Taxable{
    private int pid;
    private int price;
    private int quantity;

    Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    public void calcTax(){
        float prodTax = price*quantity*salesTax/100;
        System.out.println("sales product tax : "+prodTax);
    }
}

class XYZ{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EmpId : ");
        int empId = sc.nextInt();
        System.out.println("Enter Empname : ");
        String empName = sc.next();
        System.out.println("Enter salary : ");
        int salary = sc.nextInt();

        Taxable t = new Employee(empId,empName,salary);
        t.calcTax();

        System.out.println("Enter pid : ");
        int pid = sc.nextInt();
        System.out.println("Enter price : ");
        int price = sc.nextInt();
        System.out.println("Enter quantity : ");
        int quantity = sc.nextInt();

        Taxable t1 = new Product(pid,price,quantity);
        t1.calcTax();
    }
}