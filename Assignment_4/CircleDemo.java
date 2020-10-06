import java.util.Scanner;
class Circle{
    private int radius;
    private float area;

    void init(int radius)
    {
        this.radius = radius;
    }

    void calculateArea()
    {
        area = (float)(3.1456*radius*radius);
    }

    void display(){
        System.out.println("Area of Circle : "+area);
    }
}

class CircleDemo{
    public static void main(String args[]){
        Circle c = new Circle();
        c.init(10);
        c.calculateArea();
        c.display();
    }
}