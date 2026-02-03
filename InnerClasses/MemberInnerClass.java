class MemberInnerClass{

    static String a = "Hii";

    void m1(double d){
        System.out.println("d: " + d);
    }

    class MIClass{

        private void m2(char c){
            System.out.println("c: " + c);
        }
    }

    public static void main(String[]args){
        MemberInnerClass c1 = new MemberInnerClass();
        System.out.println(a);
        c1.m1(12.234);
        MemberInnerClass.MIClass c2 = c1.new MIClass();
        c2.m2('N');
    }
}