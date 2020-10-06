class Emp{
    private int empId;
    private String empName;

    Emp(){
        this(200,"jayant");
    }

    Emp(int empId, String empName){
        this.empId=empId;
        this.empName=empName;
    }

    void show(){
        System.out.println(empId+"    "+empName);
    }
}

class ThisConstructor{
    public static void main(String args[]){
        Emp e = new Emp();
        e.show();
    }
}