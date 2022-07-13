package Tab_1;

public class Book {
    private String Code;
    private String name;
    private String author;
    private String year;
    private int lent;
    private int total;
    Category category;

    public Book() {
    }

    public Book(String code, String name, String author, String year, Category category, int total, int lent) {
        Code = code;
        this.name = name;
        this.author = author;
        this.year = year;
        this.total = total;
        this.lent = lent;
        this.category = category;
    }
    public void Edit(String code, String name, String author, String year, Category category, int total, int lent) {
        Code = code;
        this.name = name;
        this.author = author;
        this.year = year;
        this.lent = lent;
        this.total = total;
        this.category = category;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getLent() {
        return lent;
    }

    public void setLent(int lent) {
        this.lent = lent;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String toString(){
        return getCode()+";"+getName()+";"+getAuthor()+";"+getYear()+";"+getCategory().getName()+";"+String.valueOf(getTotal())+";"+String.valueOf(getLent())+";\n";
    }
}
