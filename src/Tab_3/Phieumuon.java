package Tab_3;


public class Phieumuon {
	private String CodeBook;
	private int soluong;
	private String ID;
	private String DateBorrow;
	private String ngaytra;

	public Phieumuon() {
	}

	public Phieumuon(String codeBook, String ID, String dateBorrow, String ngaytra, int soluong) {
		CodeBook = codeBook;
		this.ID = ID;
		DateBorrow = dateBorrow;
		this.ngaytra = ngaytra;
		this.soluong = soluong;
	}

	public String getCodeBook() {
		return CodeBook;
	}

	public void setCodeBook(String codeBook) {
		CodeBook = codeBook;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getDateBorrow() {
		return DateBorrow;
	}

	public void setDateBorrow(String dateBorrow) {
		DateBorrow = dateBorrow;
	}

	public String getNgaytra() {
		return ngaytra;
	}

	public void setNgaytra(String ngaytra) {
		this.ngaytra = ngaytra;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String toString(){
		return this.getID()+";"+this.getCodeBook()+";"+this.getDateBorrow()+";"+this.getNgaytra()+";"+String.valueOf(this.soluong)+";\n";
	}

}

