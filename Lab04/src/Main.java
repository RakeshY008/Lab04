import Lab04.Person;

public class Main {
    public static void main(String[] args) {
        // set the values of the Person with the constructor arguments.
        Person myself = new Person("Dean", 40, 'm');

        System.out.println("Hello, my name is " + myself.getName() + " . I am a man and I am " + myself.getAge() + " years old.");
    }
}
