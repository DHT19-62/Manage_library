package GUI;

import Tab_1.Book;
import Tab_1.Books;
import Tab_1.Category;
import Tab_1.Table_1;
import Tab_2.Reader;
import Tab_2.Readers;
import Tab_2.Table_2;
import Tab_3.Dsphieumuon;
import Tab_3.Table_3;
import Tab_3.Phieumuon;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class WIndow extends JFrame implements ActionListener {

    private static final String path_book  = "data/Books.txt";
    private static final String path_phieumuon  = "data/phieumuon.txt";
    private static final String  path_reader = "data/Readers.txt";
    private static final ImageIcon warning = new ImageIcon("src/icon/warning.png");
    private static final ImageIcon complete = new ImageIcon("src/icon/completed.png");
    String index_table_3;
    SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");

    JPanel panel1;
    JPanel panel1_1;
    JPanel panel1_2;
    JPanel panel1_3;
    JPanel panel1_4;
    JPanel panel_tt;

    JTextField book_1;
    JTextField book_name;
    JTextField author_1;
    JTextField year_1;JTextField total_1;
    JComboBox the_loai;
    JTextField book_code_search;
    JTextField book_static;


    JButton add_1;
    JButton edit_1;
    JButton search_1;
    JButton b1_24;

    JComboBox sort_type;

// ================================================
    JPanel panel_1;
    JPanel panel_2;
    JPanel panel_3;
    JPanel panel_4;

    JButton button_1;
    JButton button_2;
    JButton button_3;
    JButton button_addreader;
    JButton button_editreader;
    JButton button_delreader;

    Table_1 table_1;
    Table_2 table_2;

    JScrollPane table_2_pane;
    JScrollPane table_1_pane;

    JPanel info_Reader;
    JPanel find_Reader;

    JLabel name_label;
    JTextField name_reader;

    JLabel id_label;
    JTextField ID_reader;

    JLabel phone_label;
    JTextField phone_reader;

    JLabel email_label;
    JTextField email_reader;

    JLabel id_find;
    JTextField id_find_txt;

    JButton find;
    JButton sort_reader;
    //===========================================

    JPanel panel3_1;
    JPanel panel3_2;
    JScrollPane panel3_3;

    JLabel id3_label;
    JLabel name3_label;
    JLabel phone3_label;
    JLabel email3_label;
    JLabel book3_code;
    JLabel book3_name;
    JLabel author3;
    JLabel NXB3;
    JLabel Date3;
    JLabel lent_quantity;

    JTextField id3_label_txt;
    JTextField name3_label_txt;
    JTextField phone3_label_txt;
    JTextField email3_label_txt;
    JTextField book3_code_txt;
    JTextField book3_name_txt;
    JTextField author3_txt;
    JTextField NXB3_txt;
    JTextField Date3_txt;
    JTextField lent_quantity_txt;

    JButton find3;
    JButton save3;
    JButton del3;
    JButton find3_book;

    JButton add3_book;

    Table_3 table_3;

    Calendar calender = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//    ==============================
    int index;
    Readers readers;
    Books books;
    Dsphieumuon dsphieumuon;

    public WIndow() throws HeadlessException {
        this.setSize(1200,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(null);



        panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 253, 130));
        panel_1.setVisible(true);
        panel_1.setSize(130,this.getHeight());
        panel_1.setLayout(new FlowLayout());
        this.add(panel_1);
        panel_1.setBounds(0,0,100,this.getHeight());


        button_1 = new JButton();
        button_1.setBorder(null);
        button_1.setIcon(new ImageIcon("src/icon/Library.png"));
        button_1.setOpaque(false);
        button_1.setContentAreaFilled(false);
        button_1.setBorderPainted(false);
        button_1.addActionListener(this);
        panel_1.add(button_1);

        button_2 = new JButton();
        button_2.setBorder(null);
        button_2.setIcon(new ImageIcon("src/icon/Reader.png"));
        button_2.setOpaque(false);
        button_2.setContentAreaFilled(false);
        button_2.setBorderPainted(false);
        button_2.addActionListener(this);
        panel_1.add(button_2);


        button_3 = new JButton();
        button_3.setBorder(null);
        button_3.setIcon(new ImageIcon("src/icon/book_loan.png"));
        button_3.setOpaque(false);
        button_3.setContentAreaFilled(false);
        button_3.setBorderPainted(false);
        button_3.addActionListener(this);
        panel_1.add(button_3);


        panel_2 = new JPanel();
        panel_2.setBackground(Color.YELLOW);
        panel_2.setVisible(true);
        panel_2.setLocation(panel_1.getWidth(),0);
        panel_2.setLayout(new BorderLayout());
        this.add(panel_2);
        panel_2.setBounds(panel_1.getWidth(),0,this.getWidth()-panel_1.getWidth(),this.getHeight());

// ================== TAB THU VIEN ======================================//
        panel1 = new JPanel();
        panel1_1 = new JPanel();
        panel1_2 = new JPanel();
        panel1_3 = new JPanel();

        GridBagLayout layout = new GridBagLayout();
        panel1_1.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0;
        JLabel b1_11 = new JLabel(" Code ");
        panel1_1.add(b1_11,gbc);

        b1_11.setForeground(Color.RED);
        book_1 = new JTextField(5);
        gbc.gridx = 1; gbc.gridy = 0;
        panel1_1.add(book_1,gbc);

        gbc.gridx = 2; gbc.gridy = 0;
        JLabel b1_13 = new JLabel(" Name ");
        panel1_1.add(b1_13,gbc);


        gbc.gridx = 3; gbc.gridy = 0;
        b1_13.setForeground(Color.RED);
        book_name = new JTextField(15);
        panel1_1.add(book_name,gbc);

        gbc.gridx = 4; gbc.gridy = 0;
        JLabel b1_15 = new JLabel(" Author ");
        b1_15.setForeground(Color.RED);
        panel1_1.add(b1_15,gbc);


        gbc.gridx = 5; gbc.gridy = 0;
        author_1 = new JTextField(15);
        panel1_1.add(author_1,gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        JLabel b1_17 = new JLabel(" Year ");
        author_1.setForeground(Color.BLUE);
        panel1_1.add(b1_17,gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        year_1 = new JTextField(10);
        panel1_1.add(year_1,gbc);

        gbc.gridx = 4; gbc.gridy = 2;
        JLabel b1_114 = new JLabel(" Total ");
        panel1_1.add(b1_114,gbc);

        gbc.gridx = 5; gbc.gridy = 2;
        total_1 = new JTextField(10);
        panel1_1.add(total_1,gbc);

        gbc.gridx = 2; gbc.gridy = 2;
        JLabel b1_19 = new JLabel(" Category ");
        b1_19.setForeground(Color.BLUE);
        panel1_1.add(b1_19,gbc);

        gbc.gridx = 3; gbc.gridy = 2;
        the_loai = new JComboBox();
        the_loai.addItem("Giao trinh");
        the_loai.addItem("Sach tham khao");
        the_loai.addItem("Khoa luan");
        the_loai.addItem("Luan van");
        the_loai.addItem("Khac");
        panel1_1.add(the_loai,gbc);
        panel1_1.setBackground(new Color(62, 146, 204));

        JPanel temp = new JPanel();
        gbc.gridx = 2; gbc.gridy = 3;
        gbc.gridwidth = 2;
        add_1 = new JButton(" Add "); add_1.addActionListener(this);
        edit_1 = new JButton(" Edit "); edit_1.addActionListener(this);
        temp.add(add_1); temp.add(edit_1);
        temp.setBackground(new Color(62, 146, 204));
        panel1_1.add(temp,gbc);

        panel1_2.setLayout(new FlowLayout());
        JLabel b1_21 = new JLabel("Code Search:");
        b1_21.setForeground(Color.BLACK);
        book_code_search = new JTextField(15);
        panel1_2.add(b1_21); panel1_2.add(book_code_search);
        panel1_2.setBackground(new Color(241, 218, 191));
        search_1 = new JButton(" Search ");
        search_1.addActionListener(this);
        b1_24 = new JButton(" Delete "); b1_24.addActionListener(this);
        panel1_2.add(search_1); panel1_2.add(b1_24);


        panel1_3.setLayout(new FlowLayout());
        JLabel b2_31 = new JLabel("Sort:");
        sort_type = new JComboBox();
        sort_type.addItem("MaSach");
        sort_type.addItem("TheLoai");
        sort_type.addItem("NamXuatBan");
        sort_type.addActionListener(this);
        panel1_3.add(b2_31); panel1_3.add(sort_type);

        panel1_4 = new JPanel();
        panel1_4.setLayout(new FlowLayout());
        JLabel b1_41 = new JLabel( " Statics ");
        book_static = new JTextField(15);
        JLabel b1_43 = new JLabel(" (Borrowed/Total) ");
        panel1_4.add(b1_41);
        panel1_4.add(book_static);
        panel1_4.add(b1_43);

        books = new Books();
        books.getBookFromFile("data/Books.txt");
        table_1 = new Table_1();
        table_1.setBooks(books);
        table_1_pane = new JScrollPane(table_1);
        table_1.UpdateTable_1();

        panel_tt = new JPanel();

        panel_tt.add(panel1_1);
        panel_tt.add(panel1_2);
        panel_tt.add(panel1_3);
        panel_tt.add(panel1_4);
        panel_tt.setLayout(new BoxLayout(panel_tt,BoxLayout.Y_AXIS));
        panel1.add(panel_tt);
        panel1.add(table_1_pane);
        panel1.setBackground(new Color(251, 254, 249));
        panel1.setLayout(new GridLayout(2,1));
        panel_2.add(panel1);

        ListSelectionModel selectionModel_1 = table_1.getSelectionModel();
        selectionModel_1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(selectionModel_1.isSelectionEmpty() == false){
                    index = selectionModel_1.getMinSelectionIndex();
                    Book book = books.getBooks().get(index);
                    book_1.setText(book.getCode());
                    book_name.setText(book.getName());
                    author_1.setText(book.getAuthor());
                    the_loai.setSelectedItem(book.getCategory().getName());
                    total_1.setText(String.valueOf(book.getTotal()));
                    year_1.setText(book.getYear());
                    book_static.setText(book.getLent()+"/"+book.getTotal());
                }
            }
        });

//============= TAB NGUOI DOC ==============================//
        panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBackground(new Color(255,153,51));
        panel_3.setVisible(true);
        panel_3.setLocation(panel_1.getWidth(),0);
        this.add(panel_3);
        panel_3.setBounds(panel_1.getWidth(),0,this.getWidth()-panel_1.getWidth(),this.getHeight());
        panel_3.setVisible(false);



        readers = new Readers();
        readers.getReaderFromFile(path_reader);

        table_2  = new Table_2();
        table_2.setReaders(readers);
        table_2_pane = new JScrollPane(table_2);
        panel_3.add(table_2_pane);
        table_2.UpdateTable_2();


        info_Reader = new JPanel();
        info_Reader.setBackground(new Color(177, 237, 232));
        info_Reader.setLayout(null);
        info_Reader.setVisible(true);
        panel_3.add(info_Reader);
        info_Reader.setBounds(0,0,panel_3.getWidth()/2,180);


        find_Reader = new JPanel();
//        find_Reader.setBackground(new Color(255, 252, 249));
        find_Reader.setLayout(null);
        find_Reader.setVisible(true);
        panel_3.add(find_Reader);
        find_Reader.setBounds(info_Reader.getWidth(),0,panel_3.getWidth()/2,180);

        Dimension dimension_label = new Dimension(70, 30);

        name_label = new JLabel("Name:");
        name_label.setSize(dimension_label);
        info_Reader.add(name_label);
        name_reader = new JTextField();
        name_reader.setSize(300, 30);
        info_Reader.add(name_reader);

        id_label = new JLabel("ID:");
        id_label.setSize(dimension_label);
        info_Reader.add(id_label);
        ID_reader = new JTextField();
        ID_reader.setSize(300, 30);
        info_Reader.add(ID_reader);

        phone_label = new JLabel("Phone:");
        phone_label.setSize(dimension_label);
        info_Reader.add(phone_label);
        phone_reader = new JTextField();
        phone_reader.setSize(300, 30);
        info_Reader.add(phone_reader);

        email_label = new JLabel("Email:");
        email_label.setSize(dimension_label);
        info_Reader.add(email_label);
        email_reader = new JTextField();
        email_reader.setSize(300,30);
        info_Reader.add(email_reader);


        Dimension button_dim = new Dimension(panel_3.getWidth()/6, 40);
        button_addreader = new JButton();
        button_addreader.setText("Add");
        button_addreader.addActionListener(this);
        button_addreader.setVisible(true);
        info_Reader.add(button_addreader);

        button_editreader = new JButton();
        button_editreader.setText("Edit");
        button_editreader.addActionListener(this);
        button_editreader.setVisible(true);
        info_Reader.add(button_editreader);

        button_delreader = new JButton();
        button_delreader.setText("Delete");
        button_delreader.addActionListener(this);
        button_delreader.setVisible(true);
        info_Reader.add(button_delreader);

        id_find = new JLabel("ID:");
        id_find.setSize(dimension_label);
        find_Reader.add(id_find);

        id_find_txt = new JTextField();
        id_find_txt.setVisible(true);
        find_Reader.add(id_find_txt);

        find = new JButton();
        find.setText("Find");
        find.setVisible(true);
        find_Reader.add(find);
        find.addActionListener(this);

        sort_reader = new JButton();
        sort_reader.setText("Sort");
        sort_reader.setVisible(true);
        sort_reader.addActionListener(this);
        find_Reader.add(sort_reader);


        ListSelectionModel selectionModel_2 = table_2.getSelectionModel();
        selectionModel_2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(selectionModel_2.isSelectionEmpty() == false){
                    index = selectionModel_2.getMinSelectionIndex();
                    Reader reader = readers.getReaders().get(index);
                    name_reader.setText(reader.getName());
                    ID_reader.setText(reader.getMSSV());
                    email_reader.setText(reader.getEmail());
                    phone_reader.setText(reader.getPhone());
                }
            }
        });


// ====================== TAB MUON SACH ================================= //

        dsphieumuon = new Dsphieumuon();
        dsphieumuon.getPhieumuonFromFile(path_phieumuon);
        dsphieumuon.setBooks(books);
        dsphieumuon.setReaders(readers);

        panel_4 = new JPanel();
        panel_4.setLayout(null);
        panel_4.setVisible(true);
        panel_4.setLocation(panel_1.getWidth(),0);
        this.add(panel_4);
        panel_4.setBounds(panel_1.getWidth(),0,this.getWidth()-panel_1.getWidth(),this.getHeight());
        panel_4.setVisible(false);

        panel3_1 = new JPanel();
        panel3_1.setVisible(true);
        panel3_1.setLayout(null);
        panel3_1.setBackground(new Color(27, 153, 139));
        panel_4.add(panel3_1);

        panel3_2 = new JPanel();
        panel3_2.setVisible(true);
        panel3_2.setLayout(null);
        panel3_2.setBackground(new Color(255, 155, 113));
        panel_4.add(panel3_2);


        id3_label = new JLabel("ID:");
        panel3_1.add(id3_label);
        id3_label_txt  = new JTextField();
        panel3_1.add(id3_label_txt);

        name3_label = new JLabel("Name:");
        panel3_1.add(name3_label);
        name3_label_txt  = new JTextField();
        panel3_1.add(name3_label_txt);

        phone3_label = new JLabel("Phone:");
        panel3_1.add(phone3_label);
        phone3_label_txt  = new JTextField();
        panel3_1.add(phone3_label_txt);

        email3_label = new JLabel("Email:");
        panel3_1.add(email3_label);
        email3_label_txt  = new JTextField();
        panel3_1.add(email3_label_txt);


        find3 = new JButton();
        find3.setText("find");
        find3.setVisible(true);
        panel3_1.add(find3);
        find3.addActionListener(this);

        save3 = new JButton();
        save3.setText("Save");
        save3.setVisible(true);
        save3.addActionListener(this);
        panel3_1.add(save3);

        del3 = new JButton();
        del3.setText("Delete");
        del3.setVisible(true);
        del3.addActionListener(this);
        panel3_1.add(del3);


        book3_code = new JLabel("Book code:");
        panel3_2.add(book3_code);
        book3_code_txt = new JTextField();
        panel3_2.add(book3_code_txt);

        find3_book = new JButton("Find");
        find3_book.setVisible(true);
        panel3_2.add(find3_book);
        find3_book.addActionListener(this);

        book3_name = new JLabel("Name:");
        panel3_2.add(book3_name);
        book3_name_txt = new JTextField();
        panel3_2.add(book3_name_txt);

        author3 = new JLabel("Author:");
        panel3_2.add(author3);
        author3_txt = new JTextField();
        panel3_2.add(author3_txt);

        NXB3 = new JLabel("NXB:");
        panel3_2.add(NXB3);
        NXB3_txt = new JTextField();
        panel3_2.add(NXB3_txt);

        lent_quantity = new JLabel("Lent quantity:");
        panel3_2.add(lent_quantity);
        lent_quantity_txt = new JTextField();
        panel3_2.add(lent_quantity_txt);

        Date3 = new JLabel("Date:");
        panel3_2.add(Date3);
        Date3_txt =  new JTextField();
        panel3_2.add(Date3_txt);
        Date3_txt.setText(dt1.format(calender.getTime()));

        add3_book = new JButton("Add");
        panel3_2.add(add3_book);
        add3_book.addActionListener(this);

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
        table_3  = new Table_3();
        table_3.setDsphieumuon(dsphieumuon);
        table_3.setReaders(readers);
        table_3.setBooks(books);
        panel3_3 = new JScrollPane(table_3);
        panel_4.add(panel3_3);
        panel3_3.setVisible(true);


        ListSelectionModel selectionModel_3 = table_3.getSelectionModel();
        selectionModel_3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (selectionModel_3.isSelectionEmpty() == false){
                    int pos = selectionModel_3.getMinSelectionIndex();
                    index_table_3 = (String) table_3.getModel().getValueAt(pos, 0) + id3_label_txt.getText().strip();
                }
            }
        });
// ==============================================================================


        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Resize();
            }
        });

    }


    private Reader CreateReader(){
        Reader reader = new Reader();
        reader.setName(name_reader.getText().strip());
        reader.setMSSV(ID_reader.getText().strip());
        reader.setEmail(email_reader.getText().strip());
        reader.setPhone(phone_reader.getText().strip());
        return  reader;
    }



    private void Resize(){

        panel_1.setBounds(0,0,100,this.getHeight());

        panel_2.setBounds(panel_1.getWidth(),0,this.getWidth()-panel_1.getWidth(),this.getHeight());

        panel_3.setBounds(panel_1.getWidth(),0,this.getWidth()-panel_1.getWidth(),this.getHeight());

        panel_4.setBounds(panel_1.getWidth(),0,this.getWidth()-panel_1.getWidth(),this.getHeight());


        info_Reader.setBounds(0,0,panel_3.getWidth()/2,180);
        find_Reader.setBounds(info_Reader.getWidth(),0,panel_3.getWidth()/2,180);

        table_2_pane.setLocation(100,info_Reader.getHeight()+5);
        table_2_pane.setSize(panel_3.getWidth()-200, panel_3.getHeight()-table_2_pane.getY()-50);
        table_2.setSize(table_2_pane.getSize());

        name_label.setLocation(10,5); name_reader.setLocation(name_label.getX()+name_label.getWidth(), 5);

        id_label.setLocation(10,name_label.getY()+name_label.getHeight()); ID_reader.setLocation(id_label.getX()+id_label.getWidth(), id_label.getY());

        phone_label.setLocation(10,id_label.getY()+id_label.getHeight()); phone_reader.setLocation(phone_label.getX()+phone_label.getWidth(), phone_label.getY());

        email_label.setLocation(10,phone_label.getY()+phone_label.getHeight()); email_reader.setLocation(email_label.getX()+email_label.getWidth(), email_label.getY());


        button_addreader.setBounds(info_Reader.getWidth()/7, info_Reader.getHeight()-40, info_Reader.getWidth()/7, 30);

        button_editreader.setBounds(3*info_Reader.getWidth()/7, info_Reader.getHeight()-40, info_Reader.getWidth()/7, 30);

        button_delreader.setBounds(5*info_Reader.getWidth()/7, info_Reader.getHeight()-40, info_Reader.getWidth()/7, 30);

        id_find.setBounds((find_Reader.getWidth()-10)/3-20,30,(find_Reader.getWidth()-20)/3,(find_Reader.getHeight()-20)/5);
        id_find_txt.setBounds((find_Reader.getWidth()-10)/3,30,(find_Reader.getWidth()-20)/3,(find_Reader.getHeight()-20)/5);

        find.setBounds(find_Reader.getWidth()/5,2*(find_Reader.getHeight()-10)/4,find_Reader.getWidth()/5, (find_Reader.getHeight()-10)/4);
        sort_reader.setBounds(3*find_Reader.getWidth()/5,2*(find_Reader.getHeight()-10)/4,find_Reader.getWidth()/5, (find_Reader.getHeight()-10)/4);

        panel3_1.setBounds(0,0,panel_4.getWidth()/3, panel_4.getHeight());
        panel3_2.setBounds(panel_4.getWidth()/3,0,2*panel_4.getWidth()/3, panel_4.getHeight()/2);
        panel3_3.setBounds(panel_4.getWidth()/3,panel_4.getHeight()/2,2*panel_4.getWidth()/3, panel_4.getHeight()/2);

        id3_label.setBounds(20,50,70, 40); id3_label_txt.setBounds(id3_label.getX()+id3_label.getWidth(), id3_label.getY(), panel3_1.getWidth() - id3_label.getX() - id3_label.getWidth()-70, 40);

        find3.setBounds(id3_label_txt.getX()+ id3_label_txt.getWidth(),50,50, 40);

        name3_label.setBounds(20,id3_label.getY()+id3_label.getHeight()+30,70, 40); name3_label_txt.setBounds(name3_label.getX()+name3_label.getWidth(), name3_label.getY(), panel3_1.getWidth() - name3_label.getX() - name3_label.getWidth()-30, 40);

        phone3_label.setBounds(20,name3_label.getY()+name3_label.getHeight()+30,70, 40); phone3_label_txt.setBounds(phone3_label.getX()+phone3_label.getWidth(), phone3_label.getY(), panel3_1.getWidth() - phone3_label.getX() - phone3_label.getWidth()-30, 40);

        email3_label.setBounds(20,phone3_label.getY()+phone3_label.getHeight()+30,70, 40); email3_label_txt.setBounds(email3_label.getX()+email3_label.getWidth(), email3_label.getY(), panel3_1.getWidth() - email3_label.getX() - email3_label.getWidth()-30, 40);

        save3.setBounds(panel3_1.getWidth()/5,email3_label.getY()+email3_label.getHeight()+30, panel3_1.getWidth()/5, 40);

        del3.setBounds(3*panel3_1.getWidth()/5,email3_label.getY()+email3_label.getHeight()+30, panel3_1.getWidth()/5, 40);

        book3_code.setBounds(50,panel3_2.getHeight()/7, 70,40); book3_code_txt.setBounds(book3_code.getX()+book3_code.getWidth(), book3_code.getY(), 150, 40);

        find3_book.setBounds(book3_code_txt.getX()+book3_code_txt.getWidth(), book3_code_txt.getY(), 50, 40);

        book3_name.setBounds(find3_book.getX()+find3_book.getWidth()+10, find3_book.getY(), 40, 40);

        book3_name_txt.setBounds(book3_name.getX()+book3_name.getWidth(), book3_name.getY(), 150, 40);

        author3.setBounds(book3_code.getX(), 3*panel3_2.getHeight()/7, 70, 40);

        author3_txt.setBounds(author3.getX()+author3.getWidth(), author3.getY(), 150, 40);

        NXB3.setBounds(author3_txt.getX()+author3_txt.getWidth()+10, author3.getY(), 40, 40);

        NXB3_txt.setBounds(NXB3.getX()+NXB3.getWidth()+10, author3.getY(), 150, 40);

        Date3.setBounds(book3_code.getX(), 5*panel3_2.getHeight()/7, 70, 40);

        Date3_txt.setBounds(Date3.getX()+Date3.getWidth(), Date3.getY(), 300, 40);

        lent_quantity.setBounds(Date3_txt.getX()+Date3_txt.getWidth()+10, Date3.getY(), 90, 40);

        lent_quantity_txt.setBounds(lent_quantity.getX()+lent_quantity.getWidth(),lent_quantity.getY(), 100, 40);

        add3_book.setBounds(NXB3_txt.getX()+NXB3_txt.getWidth(),author3.getY(), 40, 40);


        table_3.setSize(panel3_3.getSize());

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button_1) {
                panel_3.setVisible(false);
                panel_4.setVisible(false);
                panel_2.setVisible(true);
        }

        if(e.getSource() == button_2) {
                panel_2.setVisible(false);
                panel_4.setVisible(false);
                panel_3.setVisible(true);
        }
        if (e.getSource() == button_3){
            panel_2.setVisible(false);
            panel_4.setVisible(true);
            panel_3.setVisible(false);
        }
// =================================================================
        if (e.getSource() == sort_type){
            String str = (String) sort_type.getSelectedItem();
            switch (str){
                case "MaSach":
                    Collections.sort(books.getBooks(), new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getCode().compareTo(o2.getCode());
                        }
                    });
                    break;
                case "TheLoai":
                    Collections.sort(books.getBooks(), new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getCategory().getName().compareTo(o2.getCategory().getName());
                        }
                    });
                    break;
                case "NamXuatBan":
                    Collections.sort(books.getBooks(), new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getYear().compareTo(o2.getYear());
                        }
                    });
                    break;
            }
            table_1.UpdateTable_1();
            books.saveBookFromFile(path_book);
        }
        if(e.getSource() == add_1){
            String CODE = book_1.getText().strip();
            String NAME = book_name.getText().strip();
            String AUTHOR = author_1.getText().strip();
            String year = year_1.getText().strip();
            int TOTAL = Integer.parseInt(total_1.getText().strip());
            String CATEGORY = (String) the_loai.getSelectedItem();
            Category category = new Category();
            int pos = books.Find(CODE);
            if (pos >= 0){
                JOptionPane.showMessageDialog(this,"Ma sach da ton tai","Thong bao",JOptionPane.INFORMATION_MESSAGE, warning);
            }else {
                books.getBooks().add(new Book(CODE, NAME, AUTHOR, year, category.Create(CATEGORY), TOTAL, 0));
                table_1.UpdateTable_1();
                books.saveBookFromFile(path_book);
            }
        }
        if (e.getSource() == edit_1){
            String CODE = book_1.getText().strip();
            String NAME = book_name.getText().strip();
            String AUTHOR = author_1.getText().strip();
            String year = year_1.getText().strip();
            int TOTAL = Integer.parseInt(total_1.getText().strip());
            String CATEGORY = (String) the_loai.getSelectedItem();
            Category category = new Category();
            books.getBooks().get(index).Edit(CODE, NAME, AUTHOR, year, category.Create(CATEGORY), TOTAL, books.getBooks().get(index).getLent());
            table_1.UpdateTable_1();
            books.saveBookFromFile(path_book);
        }
        if (e.getSource() == search_1){
            int pos = books.Find(book_code_search.getText().strip());
            if (pos >= 0){
                table_1.setRowSelectionInterval(pos, pos);
            }else {
                JOptionPane.showMessageDialog(this,"Ma sach khong ton tai","Thong bao",JOptionPane.INFORMATION_MESSAGE, warning);
            }
        }
        if (e.getSource() == b1_24){
            if (index == 0){
                books.getBooks().removeFirst();
            }else {
                books.getBooks().remove(index);
            }
            table_1.UpdateTable_1();
            books.saveBookFromFile(path_book);
        }
        //        ===================================
        if (e.getSource() == button_addreader){
            Reader reader = CreateReader();
            if(readers.Find(reader.getMSSV())<0){
                readers.add_reader(reader);
                table_2.UpdateTable_2();
            }else {
                JOptionPane.showMessageDialog(this,"MSSV da ton tai","Thong bao",JOptionPane.INFORMATION_MESSAGE,warning);
            }
            readers.saveReaders(path_reader);
        }

        if (e.getSource() == button_editreader){
            readers.getReaders().get(index).Edit(name_reader.getText().strip(), ID_reader.getText().strip(), email_reader.getText().strip(), phone_reader.getText().strip());
            table_2.UpdateTable_2();
        }
        if (e.getSource() == button_delreader) {
            if (index != 0) readers.getReaders().remove(index);
            else readers.getReaders().removeFirst();
            table_2.UpdateTable_2();
            readers.saveReaders(path_reader);
        }
        if (e.getSource() == sort_reader){
            readers.SortReaders();
            table_2.UpdateTable_2();
            readers.saveReaders(path_reader);
        }
        if (e.getSource() == find){
            int pos = readers.Find(id_find_txt.getText().strip());
            if (pos >= 0){
                table_2.setRowSelectionInterval(pos, pos);
            }else {
                JOptionPane.showMessageDialog(this,"Khong tim thay sinh vien!","Thong bao",JOptionPane.INFORMATION_MESSAGE,warning);
            }
        }
        if (e.getSource() == find3){

            int pos = readers.Find(id3_label_txt.getText().strip());
            dsphieumuon.getPhieumuonFromFile(path_phieumuon);
            table_3.Updatetable_3(id3_label_txt.getText().strip());
            if (pos>=0){
                Reader reader = readers.getReaders().get(pos);
                name3_label_txt.setText(reader.getName());
                email3_label_txt.setText(reader.getEmail());
                phone3_label_txt.setText(reader.getPhone());
            }else{
                JOptionPane.showMessageDialog(this,"MSSV khong ton tai","Thong bao",JOptionPane.INFORMATION_MESSAGE, warning);
            }
        }
        if (e.getSource() == find3_book){
            int pos = books.Find(book3_code_txt.getText().strip());
            if (pos >= 0){
                Book book = books.getBooks().get(pos);
                book3_name_txt.setText(book.getName());
                author3_txt.setText(book.getAuthor());
                NXB3_txt.setText(book.getYear());
            }else {
                JOptionPane.showMessageDialog(this,"Ma sach khong ton tai","Thong bao",JOptionPane.INFORMATION_MESSAGE, warning);
            }
        }
        if(e.getSource() == add3_book){
            String ID = id3_label_txt.getText().strip();
            String BookCode = book3_code_txt.getText().strip();
            String Date_borrow = Date3_txt.getText().strip();
            int lent_quantity = Integer.parseInt(lent_quantity_txt.getText().strip());
            int Date_after = 0;
            Book book = null;
            int pos = books.Find(BookCode);
            if (pos >= 0){
                book = books.getBooks().get(pos);
                Date_after = book.getCategory().getPeriod();
                if (Date_after == 0) {
                    JOptionPane.showMessageDialog(this,"Sach khong duoc muon!","Thong bao",JOptionPane.INFORMATION_MESSAGE, warning);
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(this,"Ma sach khong ton tai","Thong bao",JOptionPane.INFORMATION_MESSAGE, warning);
                return;
            }
            if (book.getTotal() < book.getLent()+lent_quantity){
                JOptionPane.showMessageDialog(this,"Sach khong du so luong","Thong bao",JOptionPane.INFORMATION_MESSAGE,warning);
                return;
            }
            book.setLent(book.getLent()+lent_quantity);
            Calendar date = Calendar.getInstance();
            date.add(Calendar.DATE, Date_after);
            Phieumuon phieumuon = new Phieumuon(BookCode, ID, Date_borrow, dt1.format(date.getTime()) ,lent_quantity);
            pos = dsphieumuon.FindBookCode(phieumuon);
            if (pos >= 0){
                Phieumuon temp = dsphieumuon.getDanhSach().get(pos);
                temp.setSoluong(temp.getSoluong()+lent_quantity);
            }else{
                dsphieumuon.getDanhSach().add(phieumuon);
            }
            table_3.Updatetable_3(id3_label_txt.getText().strip());
            table_1.UpdateTable_1();
        }
        if(e.getSource() == del3){
            for(Phieumuon phieumuon: dsphieumuon.getDanhSach()){
                String temp =  phieumuon.getCodeBook()+phieumuon.getID();
                if (index_table_3.equalsIgnoreCase(temp)){
                    int pos = books.Find(phieumuon.getCodeBook());
                    Book book = books.getBooks().get(pos);
                    book.setLent(book.getLent()-phieumuon.getSoluong());
                    dsphieumuon.getDanhSach().remove(phieumuon);
                    dsphieumuon.saveDsMuon(path_phieumuon);
                    books.saveBookFromFile(path_book);
                    table_1.UpdateTable_1();
                    table_3.Updatetable_3(id3_label_txt.getText().strip());
                    JOptionPane.showMessageDialog(this,"Da xoa!","Thong bao",JOptionPane.INFORMATION_MESSAGE, complete);
                    return;
                }
            }
        }
        if (e.getSource() == save3) {
            dsphieumuon.saveDsMuon(path_phieumuon);
            books.saveBookFromFile(path_book);
            JOptionPane.showMessageDialog(this,"Da luu!","Thong bao",JOptionPane.INFORMATION_MESSAGE, complete);
        }
    }
}
