class Faculty{
    private int facultyId;
    int salary;

    void input(int facultyId){
        this.facultyId=facultyId;
    }

    void printSalary(){
        System.out.println("salary : "+salary);
    }
}

class FullTimeFaculty extends Faculty{
    private int basicSalary;
    private int allowance;

    void input(int basicSalary, int allowance, int facultyId){
        this.basicSalary=basicSalary;
        this.allowance=allowance;
        super.input(facultyId);
        super.salary = basicSalary + allowance;
    }

    void show(){
        super.printSalary();
    }
}

class PartTimeFaculty extends Faculty{
    private int workingHours;
    private int ratePerHour;

    void input(int workingHours, int ratePerHour, int facultyId){
        this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
        super.input(facultyId);
        super.salary = workingHours + ratePerHour;
    }

    void show(){
        super.printSalary();
    }
}

class FacultyDemo{
    public static void main(String args[]){
        FullTimeFaculty f = new FullTimeFaculty();
        f.input(2000,500,2001);
        f.show();

        PartTimeFaculty p = new PartTimeFaculty();
        p.input(48,50,2002);
        p.show();
    }
}