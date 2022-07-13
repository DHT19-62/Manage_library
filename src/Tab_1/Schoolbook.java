package Tab_1;

public class Schoolbook extends Book {
    public Schoolbook() {
        this.setCategory(new Category("Giao trinh", 60));
    }
    public Schoolbook(String code, String name, String author, String year, int total, int lent) {
        this.setCategory(new Category("Giao trinh", 60));
        this.setCode(code);
        this.setName(name);
        this.setAuthor(author);
        this.setLent(lent);
        this.setTotal(total);
        this.setYear(year);
    }
}
