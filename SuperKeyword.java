/**
 * it is predefined keyword and also known as base class object.
 * so in order to use super keyword we need extends relationship, by super is non-static
 * so we can't use it under static area
 * mainly it is used to differntiate between base class and dervied class properties
 * we have three levels
 * 1.Variable, 2.Constructor, 3.Methods
 */
class One{

    int a = 10;

    One(){
        System.out.println("This Constructor from One class");
    }

    public int m1(String s){
        System.out.println("m1: " + s);
        return 100;
    }
}

class SuperKeyword extends One{

    int a = 20;

    SuperKeyword(){
        super();
        System.out.println("This constructor from main class.");
    }

    public int m2(String s){
        System.out.println("Base class variable: " + super.a);
        System.out.println("Derived class variable: " + a);
        System.out.println(super.m1("Hello"));
        System.out.println("m2: " + s);
        return 200;
    }

    public static void main(String[]args){
        SuperKeyword sk = new SuperKeyword();
        System.out.println(sk.m2("Hiii"));
    }
}