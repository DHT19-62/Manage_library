package Tab_1;

public class Category {
    private String name;
    private int period;
    public Category() {}
    public Category (String name, int period) {
        this.name = name;
        this.period = period;
    }
    public Category Schoolbook(){
        return new Category( "Giao trinh", 60) ;
    }
    public Category Reference_book() {
        return new Category( "Sach than khao",30) ;
    }
    public Category Graduation_paper(){
        return new Category( "Khoa luan", 0) ;
    }
    public Category Thesis(){
        return new Category("Luan Van",0) ;
    }
    public Category Others(){
        return new Category("Khac", 10) ;
    }
    public String getName(){
        return name;
    }
    public int getPeriod() {
        return period;
    }
    public Category Create(String NAME){
        switch (NAME){
            case "Giao trinh":{
                return Schoolbook();
            }
            case "Sach tham khao":{
                return Reference_book();
            }
            case "Khoa luan":{
                return Graduation_paper();
            }
            case "Luan van":{
                return Thesis();
            }
            default:
                return Others();
        }
    }
}
