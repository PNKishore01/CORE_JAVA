/**
 * Static blocks are the blocks which are execute before the object calling or creating,
 * we can write lines of code in the static block it will execute first.
 * static blocks are part of class properties.
 */

class StaticBlock{

    String a = "Hello";

    static{
        int a = 10;
        System.out.println("Hi, I'm from static block");
        System.out.println("var in static: " + a);
    }

    void m1(){
        System.out.println("Normal method");
    }

    public static void main(String[]args){
        StaticBlock sb = new StaticBlock();
        System.out.println("var: " + sb.a);
        sb.m1();
    } 
}