import java.util.Scanner;

class OneBHK{
    private int roomArea;
    private int hallArea;
    private int price;
    static int Oneprice = 0;

    OneBHK(){
        this(150,250,5000);
    }

    OneBHK(int roomArea,int hallArea,int price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
        Oneprice = Oneprice + price;
    }

    void show(){
        System.out.println(roomArea+"   "+hallArea+"     "+price);
    }
}

class TwoBHK extends OneBHK{
    private int roomArea;
    private int hallArea;
    private int price;
    private int room2Area;
    static int Twototal= 0;

    TwoBHK(){
        roomArea=150;
        room2Area=100;
        hallArea=250;
        price=5000;
    }

    TwoBHK(int roomArea, int room2Area, int hallArea,int price)
    {
        this.room2Area=room2Area;
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
        Twototal = Twototal + price;
    }

    static void total(){
        int Total = Oneprice + Twototal;
        System.out.println("total price : "+Total);

    }

    void show(){
        super.show();
        System.out.println(roomArea+"   "+room2Area+"      "+hallArea+"     "+price);   
    
    }
}

class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TwoBHK arr[] = new TwoBHK[3];
        OneBHK o = new OneBHK();
        OneBHK o1 = new OneBHK(100,400,5000);

        for (int i=0; i<arr.length;i++)
        {
            System.out.println("Enter all Details : ");
            int roomArea = sc.nextInt();
            int room2Area = sc.nextInt();
            int hallArea = sc.nextInt();
            int price = sc.nextInt();

            TwoBHK t = new TwoBHK(roomArea,room2Area,hallArea,price);
            t.show();

            arr[i] = t;
        }

        TwoBHK.total();

    }
}