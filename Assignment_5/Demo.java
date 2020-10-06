import java.util.Scanner;
class Student{
    int rollNo;
    private float percentage;
    static int gradeCount = 0;

    Student(){
        rollNo = 39;
        percentage = 70;
    }

    Student(int rollNo,float percentage){
        this.rollNo=rollNo;
        this.percentage=percentage;
        if(percentage>75)
        {
            gradeCount++;
        }
    }

    void show(){
        System.out.println(rollNo+"    "+percentage);
    }

    static void getCount(){
        System.out.println("count of student who got A grade : "+gradeCount);
    }
}

class CollegeStudent extends Student{
    private int semester;

    CollegeStudent(){
        super();
        semester = 6;
    }

    CollegeStudent(int rollNo, float percentage, int semester)
    {
        super(rollNo,percentage);
        this.semester=semester;
    }

    void show(){
        super.show();
        System.out.println("semester : "+semester);
    }
}

class SchoolStudent extends Student{
    private int className;

    SchoolStudent(){
        super();
        className = 12;
    }

    SchoolStudent(int rollNo, float percentage, int className)
    {
        super(rollNo,percentage);
        this.className=className;
    }

    void show(){
        super.show();
        System.out.println("ClassName : "+className);
    }
}

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        CollegeStudent clgAr[] = new CollegeStudent[2];
        SchoolStudent schAr[] = new SchoolStudent[3];
        System.out.println("Enter college student details : ");
        for(int i = 0;i<clgAr.length;i++){
            System.out.println("Enter roll no. : ");
            int rollNo = sc.nextInt();
            System.out.println("Enter percentage. : ");
            float percentage = sc.nextFloat();
            System.out.println("Enter semester no. : ");
            int semester = sc.nextInt();

            CollegeStudent clg = new CollegeStudent(rollNo,percentage,semester);

            clgAr[i] = clg;
        }

        System.out.println("Enter School student details : ");
        for(int i = 0;i<schAr.length;i++){
            System.out.println("Enter roll no. : ");
            int rollNo = sc.nextInt();
            System.out.println("Enter percentage. : ");
            float percentage = sc.nextFloat();
            System.out.println("Enter class Name : ");
            int className = sc.nextInt();

           SchoolStudent sch = new SchoolStudent(rollNo,percentage,className);

            schAr[i] = sch;
        }


        System.out.println("College details : ");
        for (CollegeStudent clg : clgAr){
            clg.show();
        }

        System.out.println("School details : ");
        for (SchoolStudent sch : schAr){
            sch.show();
        }

        Student.getCount();

        System.out.println("Enter rollNo no you want to search : ");
        int roll = sc.nextInt();
        for(int i=0;i<clgAr.length;i++){
            if(roll==clgAr[i].rollNo)
            {
                System.out.println("Student is college student");
                break;
            }
            else
            {
                for(int j=0;j<schAr.length;j++){
                    if(roll==schAr[i].rollNo){
                        System.out.println("Student is School student");
                    }
                    else
                    {
                        System.out.println("Roll no is invalid");
                    }
                }
            }
        }

    }
}