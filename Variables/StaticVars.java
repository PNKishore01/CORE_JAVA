
/**
 * Variable is a container which can stores the single type of data,
 * In java we have to mention the datatype before the varName
 * Syntax:- DataType VariableName = Data;
 * ex:- int a = 10;
 * 
 * There are two types of non-access modifiers are used majorly
 * 1. Static, 2.Non-Static
 * 
 * 1. Static Variables: These variables are static variables we can use these variables(if we create gloablly in class)
 *  at anywhere inside the class without using objectName 
 *  Keyword is static.
 *    syntax:- static DataType VariableName = Data;
 * 
 * 2. Non-Static Variables: These variables are non-static variables we can use these variables(if we create gloablly in class)
 *  at anywhere inside the class with using objectName 
 *  No Keyword for non-static.
 *    syntax:- DataType VariableName = Data;
 */


class StaticVars{

    static int a = 10;

    public static void main(String[] args){
        
        System.out.println(a);
    }
}