
class One{

    public int m1(String a){
        System.out.println("First m1: " + a);
        return 100;
    }
}

class Both extends One{

    @Override
    public int m1(String a){
        System.out.println("Updated m1: " + a);
        return 100;
    }
    public char m1(double a){
        System.out.println("Second m1: " + a);
        return 'N';
    }

    public static void main(String[]args){
        Both b = new Both();
        System.out.println(b.m1("Hello"));
        System.out.println(b.m1(12.34));
    }
}