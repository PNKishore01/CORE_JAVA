class DataTypes{

    /***there are three types of dataTypes are there
     * 1. Primitive dataTypes
     * 2. Non-Primitive dataTypes
     * 3. User-defined dataTypes
     * 
     * 1. Primitive dataTypes -- By using Primitive dataTypes , we can able to store only single value in a variable.
     * */

    public static void main(String[] args){

        //Byte - byte	1bytes,	8bits,	Stores small whole numbers from -128 to 127.
        System.out.println("byte: " + 23);

        //Short - short	2bytes,	16bits,	Stores whole numbers from -32,768 to 32,767.
        System.out.println("short: " + 1000);

        //int - int	4bytes,	32bits,	The most commonly used integer type, stores numbers from approx. -2 billion to +2 billion.
        System.out.println("int: " + 23456);

        //long - long	8bytes,	64bits,	Used for very large integer values.
        System.out.println("long: " + 12345678);

        //float - float	4bytes,	32bits,	Stores single-precision floating-point numbers (approx. 6-7 decimal digits of precision).
        System.out.println("float: " + 23.54);

        //double - double	8bytes,	64bits,	Stores double-precision floating-point numbers (approx. 15-16 decimal digits of precision), the default for decimals.
        System.out.println("double: " + 1012.245);

        //character - char	2bytes,	16bits,	Stores a single Unicode character.
        System.out.println("char: " + 'A');

        //boolean - boolean	1bits,	Stores true or false values. Its exact storage size may vary depending on the JVM implementation, but it represents a single bit of information logically.
        System.out.println("boolean: " + true );
    }

}
