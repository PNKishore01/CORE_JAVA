class Seven{

    double a = 100;

    //method: non-static non-returnType without parameters
    void m7(){
        System.out.println("No Parameters");
    }

    public static void main(String[] args){
        Seven o = new Seven();
        System.out.println("a: " + o.a);
        o.m7(); // non-static methods use object variable.
    }
}