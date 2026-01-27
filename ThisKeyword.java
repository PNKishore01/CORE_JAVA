
/***
 * this keyword is pre-defined keyword and also current class object
 * it is non-static , we can't use under static properties
 * it is used differentiate between local and global properties
 * we have to use three ways:- 1.Variable level, 2.Method level, 3.Constructor level
 */

class ThisKeyword{

    int a = 10;

    ThisKeyword(){
        System.out.println("This is First Constructor");
    }

    ThisKeyword(String s){
        this();//Constructor Level
        System.out.println("Hi " + s + ", This is Constructor.");
    }

    public void m1(int a){
        System.out.println("(From Global)A: " + this.a); //variable level
        System.out.println("(From Local)A: " + a);
    }

    public String m1(char b){
        this.m1(20); //method level
        System.out.println("Character: " + b);
        return "Hello";
    }

    public static void main(String[] args){

        ThisKeyword tk = new ThisKeyword("Buddy");
        System.out.println(tk.m1('N'));
    }
}