// Coding challenge que. by DBC Sir

package Google_Class;

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