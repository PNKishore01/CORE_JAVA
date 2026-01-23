class DoubleParaConstructor{

    DoubleParaConstructor(int age, double weight){
        System.out.println("Double Parameter Constructor 1: Age: " + age + ", Weight: " + weight);
    }

 /***
 * A Constructor which have two parameters is know as Double paramater constructor.
 * Whenever we create object with passing otwone value with same data type, it automatically calls the constructor. 
 * we can also create multiple constructors but different data type otherwise JVM will confuse.
 * we can give no.of parameters based on our choice.
 */

    DoubleParaConstructor(double weight, int age){
        System.out.println("Double Parameter Constructor 2: Weight: " + weight + ", Age: " + age);
    }

    public static void main(String[] args){
        DoubleParaConstructor df = new DoubleParaConstructor(24, 70.0);
        DoubleParaConstructor df1 = new DoubleParaConstructor(70.0, 24);
    }
}