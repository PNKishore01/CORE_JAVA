
/**
 * Encapsulation--
 * it is one of the pillar of oops concept
 * it is combining of private variables, and securing authrozied data like private variables
 * whenever we assigned data to private variables, we haven't used those variables in another class
 * so, we have to provide setter and getter methods to those variables
 * setter - this method is used set or update the data, using parameters
 * getter - this method is used get the data from private variable, no parameters
 */

class User{

    private String username;
    private String password;

    User(String username, String password){
        this.username=username;
        this.password=password;
    }

    public void setusername(String username){
        this.username=username;
    }
    public void setPass(String password){
        this.password=password;
    }
    public String getusername(){
        return this.username;
    }
    public String getPass(){
        return this.password;
    }
}

class One{

    public static void main(String[]args){
        User u = new User("pnk", "pnk123");
        System.out.println("UserName: " + u.getusername() + ", Password: " + u.getPass());
        u.setusername("pnk_01");
        u.setPass("pnk@123");
        System.out.println("UserName: " + u.getusername() + ", Password: " + u.getPass());
    }
}