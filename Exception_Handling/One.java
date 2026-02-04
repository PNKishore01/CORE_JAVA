import java.util.*;
class One{
    //These are pre-defined exceptions, these are already made.
    public static void main(String[]args){

        int n = 10;
        try{
            System.out.println(n/0);//numeric value is not divisible by zero
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        String s = "Hello";
        try{
            System.out.println(s.charAt(s.length()));//string is followed by zero-index
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }

         int[] arr = {1,2,3,4,5,6,7,8};
        try{
            System.out.println(arr[arr.length]);//array is followed by zero-index
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}