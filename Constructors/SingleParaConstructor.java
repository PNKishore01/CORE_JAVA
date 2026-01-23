class SingleParaConstructor{

    SingleParaConstructor(String name){
        System.out.println("Single Parameter Constructor 1: " + name);
    }
 /***
 * A Constructor which have only one parameter is know as Single paramater constructor.
 * Whenever we create object with passing one value with same data type, it automatically calls the constructor. 
 * we can create multiple constructors but different data type otherwise JVM will confuse.
 */

    SingleParaConstructor(int age){
        System.out.println("Single Parameter Constructor 2: " + age);
    }

    public static void main(String[] args){
        SingleParaConstructor df = new SingleParaConstructor("Kishore");
        SingleParaConstructor df1 = new SingleParaConstructor(24);
    }
}