package Lab03;
/*
 *@ Author : Rakesh Yadav
 * @ Version : 1.0
 */

import java.util.Scanner;

public class Que03 {
    public static float FahrenheitToCelsius(float Fahrenheit) {
        float C = (float) ((Fahrenheit - 32) / 1.8);
        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float F = scanner.nextFloat();
        System.out.println(FahrenheitToCelsius(F));
    }
}
