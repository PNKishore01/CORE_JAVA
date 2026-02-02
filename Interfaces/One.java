interface Example{

    int a = 10;

    void m1(int b);

    String m2(char c);
}

//provide functionalities for those unimplemented methods
class One implements Example{

    public void m1(int b){
        System.out.println("A: " + b);
    }

    public String m2(char c){
        System.out.println("char: " + c);
        return "HI";
    }

    public static void main(String[]args){
        One o = new One();
        System.out.println("Varible a: " + a);
        o.m1(10);
        System.out.println(o.m2('c'));
    }
}