class Employee{
    private int empId;
    private String empName;

    void set(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    void show()
    {
        System.out.println(empId+"   "+empName);
    }
}

class ThisDemo{
    public static void main(String args[]){
        Employee e = new Employee();
        e.set(39,"jayant");
        e.show();
    }
}