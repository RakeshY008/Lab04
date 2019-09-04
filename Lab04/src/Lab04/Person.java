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

    // method override
    @Override
    public String toString(){
        StringBuilder response = new StringBuilder();
        response.append("Hello, my name is " + getName());
        response.append(" . I am a man and I am " + getAge());
        response.append(" years old.");
        return response.toString();
    }

}


