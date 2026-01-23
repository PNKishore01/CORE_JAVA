class ObjectTypeConstructor{

    ObjectTypeConstructor(){//default

    }

    ObjectTypeConstructor(ObjectTypeConstructor obj){
        System.out.println("Object Type Constructor : " + obj);
    }

 /***
 * It is Object type Constructor, we are passing object as parameter.
 * if we want pass object as parameter, first we have to create default constructor and default object
 * that default object variable name should be passed to the ObjectType.
 */

    //we can pass objectType and datatype at a time..
    ObjectTypeConstructor(ObjectTypeConstructor obj, String name){
        System.out.println("Object Type Constructor : Object: " + obj + ", Name: " + name);
    }

    public static void main(String[] args){
        ObjectTypeConstructor obj = new ObjectTypeConstructor();
        ObjectTypeConstructor df = new ObjectTypeConstructor(obj);
        ObjectTypeConstructor df1 = new ObjectTypeConstructor(obj,"Cera");
    }
}