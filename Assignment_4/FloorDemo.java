import java.util.Scanner;

class Tile{
    private int edgeLength;

    void set(int edgeLength)
    {
        this.edgeLength=edgeLength;
    }

    int calculate(){
        return edgeLength*edgeLength;
    }
}

class Floor extends Tile{
    private int length;
    private int width;

    void set(int length,int width){
        this.length=length;
        this.width=width;
    }

    int calculate(){
        return length*width;
    }

    void totalTile(Tile t)
    {
        t.set(20);
        int res = t.calculate();
        int res2 = this.calculate();
        
        int Tiles = res2/res;

        System.out.println("No of tiles : "+Tiles);
    }
}

class FloorDemo{
    public static void main(String args[]){
        Floor f = new Floor();
        f.set(100,200);
        f.totalTile(new Tile());
    }
}