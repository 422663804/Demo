package demo01.p0524.date;

public class Book {
    private String bookName;
    private String author;
    private double price;
    private String type;
    private int numPages;

    public Book(String bookName, String author, double price, String type, int numPages) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.type = type;
        this.numPages = numPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
// 在实际编程项目中，经常使用简单的类来记录一些数据，我们称这种类为数据类，
//         请编写一个简单的数据类，表示书籍，具有属性：书名、作者、价格、品类、页数等。
