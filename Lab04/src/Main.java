import Lab04.Person;
/*
 * @ Author : Rakesh Yadav
 * @ Version : 1.0
 */

public class Main {
    public static void main(String[] args) {
        // set the values of the Person with the constructor arguments.
        Person myself = new Person("Dean", 40, 'm');
        System.out.println(myself);
        Student student = new Student(myself.getName(), myself.getAge(), myself.getGender(), 2431242343234L, 6.7);
        student.study();
        Person person = new Student("Rakesh", 19, 'm', 12232214324L, 6.9);

    }
}
