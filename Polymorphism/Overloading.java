class Overloading{

    public int m1(String a){
        System.out.println("First m1: " + a);
        return 100;
    }
    public char m1(double a){
        System.out.println("Second m1: " + a);
        return 'N';
    }

    public static void main(String[]args){
        Overloading ol = new Overloading();
        System.out.println(ol.m1("Hello"));
        System.out.println(ol.m1(12.34));
    }
}