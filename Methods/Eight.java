class Eight{

    static double a = 100;

    //method: non-static non-returnType with parameters
    void m8(char c){
        System.out.println("Character: " + c);
    }

    public static void main(String[] args){
        Eight o = new Eight();
        System.out.println("a: " + a);
        o.m8('N'); // non-static methods use object variable.
    }
}