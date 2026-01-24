class Five{

    int a = 10;

    //method: non-static returnType with parameters
    String m5(int b){
        System.out.println("b: " + b);
        return "Hello One";
    }

    public static void main(String[] args){
        Five o = new Five();
        System.out.println("a: " + o.a);
        System.out.println(o.m5(20)); // non-static methods use object variable.
    }
}