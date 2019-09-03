package Lab03;
/*
 *@ Author : Rakesh Yadav
 * @ Version : 1.0
 */

public class Que04 {
    public static void main(String args[]) {
        PaternPrint();                              //method call
    }

    public static void PaternPrint() {
        // Logic to print "Half Right-angled Triangle"
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }
    }
}
