/**
 * Is-A relationship is nothing but inheritance,
 * one class properties can inherit to another class is known as is_a relation
 */

class A{
    int a = 10;
    char m1(String s){
        System.out.println(s);
        return 'B';
    }
}
class Is_A extends A{

    void m2(double d){
        System.out.println(d);
    }

    public static void main(String[]args){
        Is_A i = new Is_A();
        System.out.println(i.a);
        System.out.println(i.m1("hello"));
        i.m2(12.34);
    }
}