class DefaultConstructor{

    DefaultConstructor(){
        System.out.println("Default Constructor");
    }
    
 /***
 * A Constructor which doesn't have any type of parameters is know as default constructor.
 * Whenever we create object , it automatically calls the constructor. 
 */ 

    public static void main(String[] args){
        DefaultConstructor df = new DefaultConstructor();
    }
}

