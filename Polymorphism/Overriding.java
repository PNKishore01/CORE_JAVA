class One{
    public int m1(String a){
        System.out.println("First m1:" + a);
        return 100;
    }
}
class Overriding extends One{

    @Override
    public int m1(String a){
        System.out.println("Updated(override) m1: " + a);
        return 100;
    }

    public static void main(String[]args){
        Overriding ol = new Overriding();
        System.out.println(ol.m1("Hello"));
    }
}