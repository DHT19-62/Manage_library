package Tab_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Reader {
    private String name;
    private String MSSV;
    private String email;
    private String Phone;

    public Reader() {
    }

    public Reader(String name, String MSSV, String email, String phone) {
        this.name = name;
        this.MSSV = MSSV;
        this.email = email;
        this.Phone = phone;
    }

    public void Edit(String name, String MSSV, String email, String phone) {
        this.name = name;
        this.MSSV = MSSV;
        this.email = email;
        this.Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return getName()+";"+getMSSV()+";"+getEmail()+";"+getPhone()+";\n";
    }
}
