class Four{

    int a = 10;

    //method: static non-returnType with parameters
    static void m1(int b){
        System.out.println("b: " + b);
    }

    public static void main(String[] args){
        Four o = new Four();
        System.out.println("a: " + o.a);
        m1(20); // static methods doesn't use object variable.
    }
}