/**
 * Heirarchal Inheritance:- 
 * there are one base class should be extended by two sub classes
 */

class One{

    float a = 0.2f;
    public void m1(char ch){
        System.out.println("From One: " + ch);
    }
}

class Two extends One{

    long b = 123456;
    public void m2(int ch){
        System.out.println("From Two: " + ch);
    }
}

class Three extends One{

    char b = 'c';
    public void m3(String ch){
        System.out.println("From Three: " + ch);
    }
}

class Heirarchal{

    public static void main(String[]args){
        Two t = new Two();
        Three th = new Three();
        System.out.println("This from Two");
        System.out.println(t.a);
        System.out.println(t.b);
        t.m1('P');
        t.m2(10);
        System.out.println("------------------");
        System.out.println("This from Three");
        System.out.println(th.a);
        System.out.println(th.b);
        th.m1('P');
        th.m3("Three");
    }
}