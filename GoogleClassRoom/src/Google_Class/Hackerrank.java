// Coding challenge que. by DBC Sir

package Google_Class;

import java.util.Scanner;

public class Hackerrank {   //  Execution Class
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        if (num == 0) {
            System.out.println("N/A");
        } else {
            Book[] storeArrey = new Book[num];
            for (int i = 0; i < num; i++) {
                String bookname = myObj.nextLine().trim();
                String authorname = myObj.nextLine().trim();
                String bsno = myObj.nextLine().trim();

                storeArrey[i] = new Book(bookname, authorname, bsno);
            }
            for (Book book : storeArrey) {
                System.out.println(book);
            }
        }
    }
}

// Defination Class
class Book {
    private String bookname;
    private String authorname;
    private String bsno;

    Book(String bookname, String authorname, String bsno) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.bsno = bsno;
    }

    // Getter method
    public String getBookname() {
        return bookname;
    }

    // Setter method
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getBsno() {
        return bsno;
    }

    public void setBsno(String bsno) {
        this.bsno = bsno;
    }


    @Override
    public String toString() {
        return ("--------------------------------------------\n"
                + "Book Name : \t" + getBookname() + "\n" + "Author Name : \t" + getAuthorname() + "\n" + "ISBN : \t"
                + getBsno() + "\n" + "--------------------------------------------");
    }
}