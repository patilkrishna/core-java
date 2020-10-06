import java.util.Scanner;

class Product{
    private int pid;
    private int price;
    private int quantity;

    Product(int pid,int price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    static float total()

    void show(){
        System.out.println(pid+"   "+price+"   "+quantity);
    }

}

class ProductDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Product ar[] = new Product[5];
        for ( int i=0;i<ar.length;i++){
            System.out.println("Enter pid : ");
            int pid = sc.nextInt();
            System.out.println("Enter price : ");
            int price = sc.nextInt();
            System.out.println("Enter quantity : ");
            int quantity = sc.nextInt();

            Product p = new Product(pid, price, quantity);
            ar[i] = p;
        }

        // int max = ar[0].price;

        // for (int i=0;i<ar.length;i++){
        //     ar[i]=Product;
        //     if(ar[i].price > max)
        //     max = ar[i].price;
        // }

        for(Product a : ar){
            a.show();
        }
    }
}