interface I1{

    String a = "Hello from I1";

    double m1(String s);

    static void m2(int b){
        System.out.println("m2: " + b);
    }
}

interface I2{

    char c = 'C';

    void m3(long l);

    default int m4(){
        System.out.println("m4: ");
        return 10;
    }
}

class MultipleInheritance implements I1,I2{

    public double m1(String s){
        System.out.println("m1: " + s);
        return 123.45;
    }

    public void m3(long l){
        System.out.println("m3: " + l);
    }

    public static void main(String[]args){
        MultipleInheritance mi = new MultipleInheritance();
        System.out.println("A: " + a);
        System.out.println(mi.m1("hello"));
        I1.m2(100);//static method , so call with interface name
        mi.m3(123456);
        System.out.println(mi.m4());
    }
}