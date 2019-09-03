package DebuggingExercise;
/*
 *@ Author : Rakesh Yadav
 *@ Version : 1.0
 */

public class Program02 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        int y = 0, x = 11;              //
        if (x > 10) {
            y = x;
        }
        System.out.println("The value of Y = " + y);
    }
}
