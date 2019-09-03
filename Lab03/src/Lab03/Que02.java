package Lab03;
/*
 *@ Author : Rakesh Yadav
 * @ Version : 1.0
 */

import java.util.Scanner;

public class Que02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        // Calculation
        int num = (int) (amount * 100);
        int paisa = num % 100;
        int rupya = num / 100;

        System.out.println(rupya + " Rupees and " + paisa + " Paise ");
    }
}
