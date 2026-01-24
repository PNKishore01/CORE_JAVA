/**
 * We have to take value or data dynamically from user by using Scanner class
 * Scanner class is a predefined class.
 * Scanner class is present in the util package.
 * By using Scanner class object, we have to take inputs dynamically.
 * Before using predefined class we have to import that class from the jdk.
 */

import java.util.Scanner;

class DynamicInputs{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        //like this we have to use for all dataTypes:

        //byte
        byte a = sc.nextByte();
        System.out.println("Byte: " + a);

        //short
        short b = sc.nextShort();
        System.out.println("Short: " + b);

        //Integer
        int c = sc.nextInt();
        System.out.println("Int: " + c);

        //Long
        long d = sc.nextLong();
        System.out.println("Long: " + d);

        //Float
        float e = sc.nextFloat();
        System.out.println("Float: " + e);

        //Double
        double f = sc.nextDouble();
        System.out.println("Double: " + f);

        //Character
        char g = sc.next().charAt(0);
        System.out.println("Character: " + g);

        //String
        String h = sc.next();
        System.out.println("String: " + h);

        //Boolean
        boolean i = sc.nextBoolean();
        System.out.println("Boolean: " + i);
        
        sc.close();
    }
}