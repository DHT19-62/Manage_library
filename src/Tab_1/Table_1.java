package Tab_1;

import GUI.WIndow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.Vector;

public class Table_1 extends JTable {
    Books books;
    WIndow wIndow;
    DefaultTableModel model_1 = new DefaultTableModel(){
        String[] name = {"Code","Name","Author","Year","Category","Total","Lent"};
        @Override
        public int getColumnCount() {
            return name.length;
        }

        @Override
        public String getColumnName(int column) {
            return name[column];
        }
    };
    public Table_1() {
        this.setModel(this.model_1);
        this.setBackground(Color.WHITE);
        this.setShowGrid(true); this.setGridColor(Color.BLACK);
    }
    public void UpdateTable_1(){
        DefaultTableModel model = (DefaultTableModel) this.getModel();
        while (model.getRowCount()>0)
        {
            model.removeRow(0);
        }
        for(Book book: books.getBooks()){
            Vector<String> row = new Vector<String>();
            row.add(book.getCode());
            row.add(book.getName());
            row.add(book.getAuthor());
            row.add(book.getYear());
            row.add(book.getCategory().getName());
            row.add(String.valueOf(book.getTotal()));
            row.add(String.valueOf(book.getLent()));
            model.addRow(row);
        }
    }

    public WIndow getwIndow() {
        return wIndow;
    }

    public void setwIndow(WIndow wIndow) {
        this.wIndow = wIndow;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }
}
