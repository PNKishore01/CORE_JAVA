
/**
 * Multi_level Inheritance:-
 *  top most base class properties can be extended to intermediate class and intermediate class properties can be extended by 
 * sub class is know as mult-level
 * between the top most base class and sub class, we have to take any no of intermediate classes
 */

class One{

    int a = 10;

    public void m1(double d){
        System.out.println("It is from class One: " + d);
    }
}

class Two extends One{
    static String b = "Kishore";

    public static int m2(char d){
        System.out.println("It is from class Two: " + d);
        return 10;
    }

    public static char m3(){
        return 'N';
    }
}

class Multi_level extends Two{

    int c = 30;

    public static void main(String[] args){
        Multi_level ml = new Multi_level();
        System.out.println("From one a: " + ml.a);
        ml.m1(12.34);
        System.out.println("From Two b: " + b);
        System.out.println(m2('P'));
        System.out.println(m3());
        System.out.println("From sub-class c: " + ml.c);
    }
}