class LocalInnerClass{

    String a = "Bye";

    void m1(String s){
        System.out.println("s: " + s);
    }

    int m2(String b){
        System.out.println("b: " + b);

        class InnerClass{
            public void m3(char c){
                System.out.println("c: " + c);
            }
        }
        InnerClass ic = new InnerClass();
        ic.m3('P');
        return 100;
    }

    public static void main(String[]args){
        LocalInnerClass c = new LocalInnerClass();
        System.out.println(c.a);
        c.m1("One");
        System.out.println(c.m2("Two"));
    }
}