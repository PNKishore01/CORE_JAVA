class Two{

    static String a = "Hiii";

    //method: static returnType without parameters
    static String m2(){
        return "Hello Two";
    }

    public static void main(String[] args){
        Two o = new Two();
        System.out.println("a: " + a);
        System.out.println(m2()); // static methods doesn't use object variable.
    }
}