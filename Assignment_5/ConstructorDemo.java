class Person{

    static int count = 0;

    Person(){
        System.out.println("no-arg Person");
        count++;
    }

    Person(int i){
        System.out.println("param Person"+i);
        count++;
    }
}
class Employee extends Person{
    Employee(){
        this(10);
        System.out.println("no-arg Employee");
        count++;
    }

    Employee(int i){
        super(50);
        System.out.println("param Employee "+i);
        count++;
    }
}
class ConstructorDemo{
    public static void main(String args[]){
        Person p = new Employee();
        Person p1 = new Employee(12);
    }
}