import User.java;

public class Main{
    public static void main(String[] args){
        User myObj = new User("rakesh","gla",2018);
        System.out.println(myObj.getEmail());
        System.out.println(myObj.getPassword());
    }
}
