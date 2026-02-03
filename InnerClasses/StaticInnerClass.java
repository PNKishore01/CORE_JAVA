class StaticInnerClass{

    int a = 10;

    int m1(double d){
        System.out.println("d: " + d);
        return 20;
    }

    static class SIClass{
        String s = "Hello";
        public void m2(long l){
            System.out.println("l: " + l);
        }
    }

    public static void main(String[]args){
        StaticInnerClass c1 = new StaticInnerClass();
        System.out.println(c1.a);
        System.out.println(c1.m1(12.34));
        SIClass c2 = new SIClass();
        System.out.println(c2.s);
        c2.m2(1234567);
    }
}