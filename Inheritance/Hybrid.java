/**
 * Hybrid Inheritance:- 
 * It is a combination of heirarchal and multi-level.
 */

class One{

    float a = 1.2f;

    public void m1(char ch){
        System.out.println("From One: " + ch);
    }
}

class Two extends One{

    long b = 123456;

    public static void m2(int i){
        System.out.println("From Two: " + i);
    }
}

class Three extends One{

    char b = 'c';
    public void m3(String ch){
        System.out.println("From Three: " + ch);
    }
}

class Four extends Two{

    public void m4(double d){
        System.out.println("From Four: " + d);
    }
}

class Five extends Three{

    public void m5(long l){
        System.out.println("From Five: " + l);
    }
}

class Hybrid{

    public static void main(String[]args){
        Four fr = new Four();
        Five fv = new Five();

        System.out.println("From class Four:" );
        System.out.println(fr.a);
        System.out.println(fr.b);
        fr.m1('K');fr.m2(10);fr.m4(12.34);
        System.out.println("---------------------");
        System.out.println("From class Four:" );
        System.out.println(fv.a);
        System.out.println(fv.b);
        fv.m1('K');fv.m3("Hi");fv.m5(123456);
    }
}