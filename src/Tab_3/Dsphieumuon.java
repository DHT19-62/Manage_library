package Tab_3;

import Tab_1.Book;
import Tab_1.Books;
import Tab_1.Category;
import Tab_2.Readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Dsphieumuon {
	private LinkedList<Phieumuon> danhSach;
	private Books books;
	private Readers readers;

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Readers getReaders() {
		return readers;
	}

	public void setDanhSach(LinkedList<Phieumuon> danhSach) {
		this.danhSach = danhSach;
	}

	public void setReaders(Readers readers) {
		this.readers = readers;
	}

	public Dsphieumuon() {
		this.danhSach = new LinkedList<Phieumuon>();
	}

	public LinkedList<Phieumuon> getDanhSach() {
		return danhSach;
	}
	public void getPhieumuonFromFile(String pathname){
		this.danhSach.clear();
		File file = new File(pathname);
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()){
				String[] temp = input.nextLine().split(";");
				this.danhSach.add(new Phieumuon(temp[1], temp[0], temp[2], temp[3], Integer.parseInt(temp[4])));
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
	public void saveDsMuon(String pathname){
		Collections.sort(this.danhSach, new Comparator<Phieumuon>() {
			@Override
			public int compare(Phieumuon o1, Phieumuon o2) {
				return o1.getNgaytra().compareTo(o2.getNgaytra());
			}
		});
		File file = new File(pathname);
		try {
			Scanner input = new Scanner(file);
			if(true){
				try {
					input.close();
					FileWriter writer = new FileWriter(file);
					if (this.danhSach.isEmpty() == false){
						for(Phieumuon phieumuon: this.getDanhSach()){
							writer.write(phieumuon.toString());
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
	public int FindBookCode(Phieumuon phieumuon){
		for (Phieumuon phieumuon1: this.getDanhSach()){
			String a = phieumuon.getID()+phieumuon.getCodeBook();
			String b = phieumuon1.getID()+phieumuon1.getCodeBook();
			if (a.equalsIgnoreCase(b)){
				return this.getDanhSach().indexOf(phieumuon1);
			}
		}
		return -1;
	}
}
