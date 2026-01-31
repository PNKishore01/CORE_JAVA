abstract class Ab{

    abstract double m1(String s);

    public void m2(char ch){
        System.out.println("m2: " + ch);
    }
}

class One extends Ab{

    public double m1(String s){
        System.out.println("m1: " + s);
        return 12.34;
    }

    public static void main(String[]args){
        One o = new One();
        System.out.println(o.m1("Hello"));
        o.m2('C');
    }
}