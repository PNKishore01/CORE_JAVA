class Six{

    float a = 10;

    //method: non-static returnType without parameters
    String m6(){
        System.out.println("No Parameters");
        return "Hello Six";
    }

    public static void main(String[] args){
        Six o = new Six();
        System.out.println("a: " + o.a);
        System.out.println(o.m6()); // non-static methods use object variable.
    }
}