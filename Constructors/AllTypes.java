class AllTypes{
    
    AllTypes(){ //Default
        System.out.println("Default Constructor.");
    }
    
    AllTypes(int num){   //Single
        System.out.println("Single Constructor. Num: " + num);
    }

    AllTypes(String car, int count){     //Double
        System.out.println("Double Constructor. Car: " + car + ", Count: " + count);
    }

    AllTypes(AllTypes at){     //ObjectType
        System.out.println("ObjectType Constructor. Object: " + at);
    }

    AllTypes(AllTypes at, String color){     //ObjectType with normal dataType
        System.out.println("ObjectType with normal dataType Constructor. Object: " + at + ", color: " + color);
    }

    public static void main(String[] args){
        AllTypes a1 = new AllTypes();
        AllTypes a2 = new AllTypes(1234);
        AllTypes a3 = new AllTypes("Swift", 2);
        AllTypes a4 = new AllTypes(a1);
        AllTypes a5 = new AllTypes(a1,"Green");
    }
}