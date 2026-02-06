/***
 * Non-static Block is block it will call whenever we create a object,
 * it is also block which we can create or write lines of code
 * it is object properties.
 */

class Non_StaticBlock{

    {
        double a = 123.45;
        System.out.println("Hi, I'm from Non-static block");
        System.out.println("var in non-static: " + a);
    }

    void m1(String s){
        System.out.println("From m1: " + s);
    }

    public static void main(String[]args){
        Non_StaticBlock ns = new Non_StaticBlock();
        ns.m1("Hello");
        Non_StaticBlock ns1 = new Non_StaticBlock();
    }

}