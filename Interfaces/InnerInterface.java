/**
 * whenever we create an interface inside another interface it is known as inner interface or nested interface
 * by default these are considered as static, so we can acess them directly by using outer interface name.
 */

interface I1{

    double d = 125.34;

    int m1(String s);

    interface I2{

        double m2(long l);
    }
}

class InnerInterface implements I1,I1.I2{

    public int m1(String s){
        System.out.println("m1: " + s);
        return 100;
    }

    public double m2(long l){
        System.out.println("m2: " + l);
        return 123.45;
    }

    public static void main(String[] args){
        InnerInterface ii = new InnerInterface();
        System.out.println(d);
        System.out.println(ii.m1("hello"));
        System.out.println(ii.m2(123456));
    }
}