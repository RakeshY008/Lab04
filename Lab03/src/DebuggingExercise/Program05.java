package DebuggingExercise;
/*
 *@ Author : Rakesh Yadav
 * @ Version : 1.0
 */

public class Program05 {

    class ScopeDemo {
        public static void main(String[] args) {
            int m = 10;
            {
                int m = 20;
            }
        }
    }
}
