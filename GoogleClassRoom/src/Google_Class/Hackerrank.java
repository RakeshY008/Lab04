// Coding challenge que. by DBC Sir
package Google_Class;

import java.util.Scanner;

public class Hackerrank {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        if (num == 0) {
            System.out.println("N/A");
        } else {
            myObj.nextLine().trim();
            Book[] store = new Book[num];
            for (int i = 0; i < num; i++) {
                String bookname = myObj.nextLine().trim();
                String authorname = myObj.nextLine().trim();
                String bsno = myObj.nextLine().trim();
                store[i] = new Book(bookname, authorname, bsno);
            }
        }
        for (int i = 0; i < num; )
    }
}

class Book {

}