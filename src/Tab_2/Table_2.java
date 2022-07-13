package Tab_2;

import GUI.WIndow;
import Tab_1.Book;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class Table_2 extends JTable {
    Readers readers;
    DefaultTableModel model_2 = new DefaultTableModel(){
        String[] name = {"Name","MSSV","Email","Phone"};
        @Override
        public int getColumnCount() {
            return name.length;
        }

        @Override
        public String getColumnName(int column) {
            return name[column];
        }
    };


    public Readers getReaders() {
        return readers;
    }

    public void setReaders(Readers readers) {
        this.readers = readers;
    }

    public Table_2() {
        this.setModel(model_2);
        this.setBackground(Color.WHITE);
        this.setShowGrid(true); this.setGridColor(Color.BLACK);
    }
    public void UpdateTable_2(){
        DefaultTableModel model = (DefaultTableModel) this.getModel();
        while (model.getRowCount()>0)
        {
            model.removeRow(0);
        }
        for(Reader reader: readers.getReaders()){
            Vector<String> row = new Vector<String>();
            row.add(reader.getName());
            row.add(reader.getMSSV());
            row.add(reader.getEmail());
            row.add(reader.getPhone());
            model.addRow(row);
        }
    }
}
