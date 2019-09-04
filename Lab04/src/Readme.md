GLA University, 2019
Object-Oriented Programming Lab BCSC0802
Programming Exercises
Create a class named Person (please make the 'P' in 'Person' capital) with three fields for their name, age and gender.
private String name
private int age
private char gender
Create getter and setter methods for the fields.
Getter Method Signatures
public String getName()
public int getAge()
public char getGender()
Setter Method Signatures
public void setName(String name)
public void setAge(int age)
public void setGender(char gender)
Create a parametrized constructor for this class with all the three fields. The constructor method signature is given below.
public Person(String name, int age, char gender)
Create another class named Main (please make the 'M' in 'Main' capital). Inside this class and inside the public static void main(String[] args) method, create an object of the Person class. Don't forget to import the Person class into the Main class, if you had declared the Person class in another package.
// optional - import the Person class here
public class Main {
	public static void main(String[] args) {
		// create an object of the Person class named myself
		Person myself = new Person();
	}
}
Inside the Main class and inside the public static void main(String[] args) method, where you might have created an object of the Person class, set the state (values for the object variables) as your own values.
Ex -
Person myself = new Person("Dean", 40, 'm');
and print them to the console window as output in the format given below -
Hello, my name is Dean. I am a man and I am 40 years old.
You could use the System.out.println() method to do the above task.
// optional - import the Person class here
public class Main {
	public static void main(String[] args) {
		// create an object of the Person class here named myself
		// set the values of the Person with the constructor arguments.
		// print the object state to the console window as output
		System.out.println(myself.toString());
		// You could also write the above line of code as
		System.out.println(myself);
	}
}
You will have to use the toString() method from the Object Superclass and override it in your Person class
public class Person {
	// create the fields for the Person class
	// create the getter and setter methods for the Person class
	// create the parametrized constructor for the Person class
	@Override
	public String toString() {
		// write your code here to override the toString() method
	}
}
