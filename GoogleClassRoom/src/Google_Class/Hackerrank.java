// Coding challenge que. by DBC Sir

package Google_Class;
import java.util.Scanner;

public class Hackerrank {   //  Execution Class
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        myObj.nextLine().trim();
        Book[] storeArrey = new Book[num];
        if (num == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < num; i++) {
                String bookname = myObj.nextLine();
                String authorname = myObj.nextLine();
                String bsno = myObj.next();
                myObj.nextLine().trim();

                storeArrey[i] = new Book(bookname, authorname, bsno);
            }

            for (Book book : storeArrey) {
                System.out.println(book);
            }
        }
        myObj.close();
    }
    }

// Defini tion Class
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

    public String getAuthorname() {
        return authorname;
    }

    public String getBsno() {
        return bsno;
    }

    // Setter method
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
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