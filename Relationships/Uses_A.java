/**
 * The USES-A relationship represents dependency, where one class uses another class to perform a specific 
 * operation, often through method parameters or local variables.
 */
class Printer {
    void print(String msg) { 
        System.out.println(msg); 
    }
}

class Report {
    void generate(Printer p) {  
        p.print("Generating report...");
    }
}

class Uses_A{
    public static void main(String[]args){
        Printer p = new Printer();
        Report r = new Report();
        r.generate(p);
    }
}