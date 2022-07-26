package classstructureconstructors;

public class Book {

    private String author;
    private String title;
    private String regNumber;


    public Book(){

    }

    public Book(String author){
        this.author=author;
    }

    public Book(String author, String title){
        this.author=author;
        this.title=title;

    }

    public void register(String regNumber){
        this.setRegNumber(regNumber);
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}
