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

    // parameterized constructor
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}
/*
class Main {
    public static void main(String[] args) {
        // create an object of the Person class named myself
        Person myself = new Person("Dean", 40, 'm');

    }

 */



