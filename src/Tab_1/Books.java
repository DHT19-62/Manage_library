package Tab_1;

import Tab_2.Reader;
import Tab_2.Readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Books {
    private LinkedList<Book> books;

    public Books() {
        books = new LinkedList<Book>();
    }

    public LinkedList<Book> getBooks() {
        return books;
    }

    public int Find(String CODE){
        for (Book book: books){
            if (book.getCode().equalsIgnoreCase(CODE))
                return books.indexOf(book);
        }
        return -1;
    }
    public void sortByCode(){
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getCode().compareTo(o2.getCode());
            }
        });
    }
    public void sortByYear(){
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYear().compareTo(o2.getYear());
            }
        });
    }
    public void sortByCategory(){
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                String c1 = o1.getCategory().getName();
                String c2 = o2.getCategory().getName();
                return c1.compareTo(c2);
            }
        });
    }
    public void getBookFromFile(String pathname){
        File file = new File(pathname);
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                String[] temp = input.nextLine().split(";");
                Category category = new Category();
                Book book = new Book(temp[0], temp[1], temp[2], temp[3],category.Create(temp[4]),Integer.parseInt(temp[5]),Integer.parseInt(temp[6]));
                books.add(book);
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void saveBookFromFile(String pathname){
        File file = new File(pathname);
        try {
            Scanner input = new Scanner(file);
            if(true){
                try {
                    input.close();
                    FileWriter writer = new FileWriter(file);
                    if (this.getBooks().isEmpty() == false){
                        for(Book book: this.getBooks()){
                            writer.write(book.toString());
                        }
                    }
                    writer.close();
                } catch (IOException e) {

                }
            }
        } catch (FileNotFoundException e) {
            try {
                new File(pathname).createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
