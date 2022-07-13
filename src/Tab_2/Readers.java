package Tab_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Readers {
    private LinkedList<Reader> readers;


    public Readers() {
        this.readers = new LinkedList<Reader>();
    }

    public void add_reader(String NAME, String ID, String EMAIL, String phone){
        this.readers.add(new Reader(NAME, ID, EMAIL,phone));
    }

    public void add_reader(Reader reader){
        this.readers.add(reader);
    }

    public boolean ReadersEmpty(){
        return this.readers.isEmpty();
    }

    public LinkedList<Reader> getReaders() {
        return readers;
    }

    public int Find(String mssv){
        for (Reader reader: this.readers){
            if (mssv.equalsIgnoreCase(reader.getMSSV())){
                return this.readers.indexOf(reader);
            }
        }
        return -1;
    }

    public void EditInReaders(int index, String NAME, String ID, String EMAIL, String phone){
        this.readers.get(index).Edit(NAME,ID,EMAIL,phone);
    }

    public void SortReaders(){
        Collections.sort(this.readers, new Comparator<Reader>() {
            @Override
            public int compare(Reader o1, Reader o2) {
                return o1.getMSSV().compareTo(o2.getMSSV());
            }
        });
    }

    public void getReaderFromFile(String pathname){
        File file = new File(pathname);

        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                String[] temp = input.nextLine().split(";");
                this.add_reader(temp[0], temp[1], temp[2], temp[3]);
            }
            input.close();
        }catch (FileNotFoundException e){
            try {
                new File(pathname).createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void saveReaders(String pathname){
        File file = new File(pathname);
        try {
            Scanner input = new Scanner(file);
            if(input.hasNext()){
                try {
                    input.close();
                    FileWriter writer = new FileWriter(file);
                    if (this.ReadersEmpty() == false){
                        for(Reader reader: this.getReaders()){
                            writer.write(reader.toString());
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
