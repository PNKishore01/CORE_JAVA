/**
 * Which interface have only one abstract method and irrespective of defined methods it is called as functional interface
 * we have defined that one abstract method using lambda expression.
 * 
 * lambda functions are the new features in java which was introduced in java 1.8 and it is mainly used to defined 
 * functional interfaces
 */

interface I1{

    int m1(String s);
}

class LambdaExpression{

    public static void main(String[] args){
        I1 i = (s) -> {
            System.out.println(s);
            return 10;
        };

        System.out.println(i.m1("Hello"));
    }
}