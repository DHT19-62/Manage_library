package Tab_3;

import Tab_1.Book;
import Tab_1.Books;
import Tab_2.Readers;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class Table_3 extends JTable {
    Dsphieumuon dsphieumuon;
    Readers readers;
    Books books;
    DefaultTableModel model_3 = new DefaultTableModel(){
        String[] name = {"Code","Name","Author","Year","Category","Total","Lent","Date","Return Date"};
        @Override
        public int getColumnCount() {
            return name.length;
        }

        @Override
        public String getColumnName(int column) {
            return name[column];
        }
    };

    public Table_3() {
        this.setModel(model_3);
        this.setShowGrid(true);
        this.setGridColor(Color.BLACK); this.setBackground(Color.WHITE);
    }

    public void setDsphieumuon(Dsphieumuon dsphieumuon) {
        this.dsphieumuon = dsphieumuon;
    }

    public void setReaders(Readers readers) {
        this.readers = readers;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public void Updatetable_3(String ID){
        while (model_3.getRowCount()>0)
        {
            model_3.removeRow(0);
        }
        for( Phieumuon phieumuon: this.dsphieumuon.getDanhSach()){
            if (phieumuon.getID().equalsIgnoreCase(ID)){
                int pos = this.books.Find(phieumuon.getCodeBook());
                Book book = this.books.getBooks().get(pos);
                Vector<String> row = new Vector<String>();
                row.add(book.getCode());
                row.add(book.getName());
                row.add(book.getAuthor());
                row.add(book.getYear());
                row.add(book.getCategory().getName());
                row.add(String.valueOf(book.getTotal()));
                row.add(String.valueOf(phieumuon.getSoluong()));
                row.add(phieumuon.getDateBorrow());
                row.add(phieumuon.getNgaytra());
                model_3.addRow(row);
            }
        }
    }
}
