/**
 * The HAS-A relationship represents composition or aggregation, 
 * where one class contains another class as a member variable
 */

class Engine{
    void start() {
        System.out.println("Engine started...");
    }
}

class Car{

    static Engine e;

    Car(Engine e){
        this.e=e;
    }

    void carStart(){
        e.start();
        System.out.println("Car started....");
    }
}

class Has_A{

    public static void main(String[]args){
        Engine e = new Engine();
        Car c = new Car(e);
        c.carStart();
    }
}