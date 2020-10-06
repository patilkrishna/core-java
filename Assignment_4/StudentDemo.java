import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    int age;
    int score;

    static int i=0;
    static int j=0;
    static int k=0;
    static int m=0;

    static int arr[]= new int[10];
    static int arr1[] = new int[10];
    static int arr2[] = new int[10];
    static int arr3[] = new int[10];

    void set(String name,int rollNo,int age,int score){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.score=score;
    }

    void show(){
        System.out.println(name+"   "+rollNo+"   "+age+"    "+score);
    }

    void group(){
        if(score >= 0 && score<= 50)
        {
            arr[i]=score;
            i++;
        }
        else if (score > 50 && score <= 65)
        {
            arr1[j]=score;
            j++;
        }
        else if (score > 65 && score <= 80)
        {
            arr2[k]=score;
            k++;
        }
        else
        {
            arr3[m]=score;
            m++;
        }
    }

    void groupShow(){
        System.out.println("between 0 and 50");
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
        System.out.println("between 50 and 65");
        for(int a=0;a<arr1.length;a++){
            System.out.println(arr1[a]);
        }
        System.out.println("between 65 and 80");
        for(int a=0;a<arr2.length;a++){
            System.out.println(arr2[a]);
        }
        System.out.println("between 80 and 100");
        for(int a=0;a<arr3.length;a++){
            System.out.println(arr3[a]);
        }
    }

}
class StudentDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[10];
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter name");	
            String name = sc.next();
            System.out.println("Enter rollno");	
            int rollNo = sc.nextInt();
            System.out.println("Enter age");	
            int age = sc.nextInt();
            System.out.println("Enter score");	
            int score = sc.nextInt();
            Student s = new Student();
            s.set(name,rollNo,age,score);
            s.show();
            s.group();
            s.groupShow();
            arr[i] = s;
        }
    }
}