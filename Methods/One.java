class One{

    int a = 10;

    //method: static returnType with parameters
    static String m1(int b){
        System.out.println("b: " + b);
        return "Hello One";
    }

    public static void main(String[] args){
        One o = new One();
        System.out.println("a: " + o.a);
        System.out.println(m1(20)); // static methods doesn't use object variable.
    }
}