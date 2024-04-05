package classProject;

public class Book {
    private String bookName;
    private String bookCategory;
    private String bookAuthor;

    public Book(String bookName, String bookCategory, String bookAuthor){
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookAuthor = bookAuthor;
    }   

    public String getBookName() {
        return bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }    
}
