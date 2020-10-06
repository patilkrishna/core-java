import java.util.Scanner;

class Employee{
    private int empNo = 101;
    private int salary;
    private static int totalSalary = 0;
    public static int counter = 0;


        Employee(int salary){
            empNo++;
            counter++;
            this.salary = salary;
            totalSalary = totalSalary + salary;
        }

        static void totEmployee(){
            System.out.println("Total Employee : "+counter);
        }

        static void totSalary(){
            System.out.println("Total Salary : "+totalSalary);
        }
}

class EmployeeDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary for 1st employee : ");
        int sal = sc.nextInt();
        Employee e = new Employee(sal);
        System.out.println("Enter salary for 2md employee : ");
        int sal1 = sc.nextInt();
        Employee e1 = new Employee(sal1);
        System.out.println("Enter salary for 3rd employee : ");
        int sal3 = sc.nextInt();
        Employee e2 = new Employee(sal3);
        Employee.totSalary();
        Employee.totEmployee();
    }
}