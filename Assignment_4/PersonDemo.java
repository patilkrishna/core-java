class Person{
    private String name;
    private int age;
    
    Person(){
        age = 18;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println(name+"    "+age);
    }
}
class PersonDemo{
    public static void main(String args[]){
        Person p = new Person();
        p.show();
        Person p1 = new Person("Jayant", 24);
        p1.show();
    }
}