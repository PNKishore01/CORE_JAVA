class Object{

    int a = 52;

    public int m1(){
        return 100;
    }

    public static void main(String[] args){
        Object ob = new Object();

        //if we want to call non-static variables and method then use object of current class
        System.out.println("Object: " + ob);
        System.out.println(ob.a);
        System.out.println(ob.m1());
    }
}

/**
 * it is instance of class which allocates memory space for class properties
 * it is real-world entity which contains both state and behavior
 * 
 * syntax:- className variable = new(keyword) className(paranthesis);
 */