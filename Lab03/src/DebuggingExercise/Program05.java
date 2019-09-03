package DebuggingExercise;
/*
 *@ Author : Rakesh Yadav
 * @ Version : 1.0
 */

public class Program05 {

    static class ScopeDemo {
        public static void main(String[] args) {
            int m = 10;
            {
                m = 20;
                System.out.println(m);
            }
        }
    }
}
