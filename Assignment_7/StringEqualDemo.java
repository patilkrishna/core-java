package Assignment_6;

import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return empId == emp.empId;
	}
		
}

public class StringEqualDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[5];
		for(int i=0;i<emp.length;i++) {
			System.out.println("enter employee Id : ");
			int empId = sc.nextInt();
			System.out.println("enter employee Name : ");
			String empName = sc.next();
			Employee emp1 = new Employee(empId, empName);
			emp[i] = emp1;
		}
		
		for (int i = 0; i < (emp.length-1); i++) {
			if(emp[i].equals(emp[i+1])==true) {
				System.out.println("EmpId of employee "+emp[i]+"is equal to EmpId of Employee "+emp[i+1]);
			}
			else
			{
				System.out.println("empId of both Employee's are not equal");
			}
		}
		
		for(Employee e : emp) {
			System.out.println(e);
		}
	}

}
