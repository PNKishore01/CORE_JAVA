import java.io.*;
//data should be stored in the form of objects 

class Employee{

    int eid;
    String ename;
    double esalary;

    Employee(int eid, String ename, double esalary){
        this.eid=eid;
        this.ename=ename;
        this.esalary=esalary;
    }

    int getId(){
        return eid;
    }
    String getName(){
        return ename;
    }
    double getSalary(){
        return esalary;
    }

}


class ObjectsInFile{

    public static void main(String[] args){
        File f = new File("E:\\Core_Java\\File_Handling\\sample.txt");
        f.createNewFile();

        //insert data into file
        FileOutputStream fis = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Employee(101,"Naga",38000));
        oos.writeObject(new Employee(102,"Kishore",28000));
        oos.writeObject(new Employee(103,"Cera",22000));
        oos.writeObject(new Employee(104,"Rock",58000));
        oos.writeObject(new Employee(105,"Siri",20000));
        oos.flush();
        oos.close();
        fos.close();

        //retrive data from file
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            while(true){
                Employee e = (Employee)ois.readObject();
                System.out.println("Id: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
            }
        }
        catch(Exception e){}
     }
}