interface One{
    abstract int m1(String s);
}
class Anonymous{
    
    public static void main(String[]args){
        One o = new One(){
            public int m1(String s){
                System.out.println(s);
                return 10;
            }
        };
        System.out.println(o.m1("hello"));
    }
}