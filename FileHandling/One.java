import java.io.*; //all file related properties are present in io package
class One{

    public static void main(String[] args){

        File f = new File("E:\\Core_Java\\File_Handling\\sample.txt"); //creating file object

        if(f.createNewFile()) //creating file and it returns boolean
            System.out.println("File Created...");
        else
            System.out.println("File already Existed.");
        
        //we have to write the data into file so use FileWriter object
        FileWriter fw = new FileWriter(f,true); //in parameters we have to give file object and boolean(permission for changes)
        fw.write("\n Hi"); //we have to mention \n otherwise all data should write in only one line
        fw.write("\n Hello, I'm kishore");
        fw.write("\n I'm learning File Handling concept in Java");
        fw.flush();
        fw.close(); // we have to mention flush and close otherwise data will overflow.
        // ----- data writing into the file is completed -----

        //reda from a file, so we have to use FileReader and BufferedReader within same file(f)
        System.out.println("Using BufferedReader");
        FileReader fr = new FileReader(f);
        BufferedReader bfr = new BufferedReader(fr);
        String x = ""; //temporary string
        while((bfr.readLine()) != null){ // it is taking line by line , that line should be stored in x
            System.out.println(x);       // if x is null then no data to print.
        }
        bfr.close();
        fr.close();//in reading no need to use flush

        System.out.println("Using Scanner class");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();        
    }
}