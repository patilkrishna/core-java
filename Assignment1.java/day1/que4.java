/* 04.Write a program that initializes 2 byte type of variables.
 Add the values of these variables and store in a byte type of variable.
 [Note: primitive down casting is required in this program ] . */

 class que4{
    public static void main(String[] args) {

        byte a = 5;
        byte b = 10;
        byte c = (byte)(a+b);

        System.out.println("sum is : "+c);
        
    }
}