class Three{

    static String a = "hello";
    char ch = 'C';

    //method: static non-returnType without parameters
    static void m3(){
        System.out.println("a: " + a);
    }

    public static void main(String[] args){
        Three o = new Three();
        System.out.println("ch: " + o.ch);
       m3(); // static methods doesn't use object variable.
    }
}