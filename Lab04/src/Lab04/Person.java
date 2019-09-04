package Lab04;

/*
 * @ Author : Rakesh Yadav
 * @ Version : 1.0
 */

public class Person {
    private String name;
    private int age;
    private char gender;

    // getter methods
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

    }

}
