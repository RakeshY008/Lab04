package Lab03;
/*
 *@ Author : Rakesh Yadav
 * @ Version : 1.0
 */
import java.util.Scanner;

public class Que01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HarmonicSeries(n);
    }
    public static void HarmonicSeries(int num){
        double sum = 0.0 ;
        for (int i=1;i<=num;i++) {
            sum +=1.0 / i;
        }
        System.out.println(sum);
    }

}
