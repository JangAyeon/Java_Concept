package java_7;

public class Book {
	
	private String bookname;
	private String author;
	
	public Book() {};//����Ʈ ������
	
	public Book(String bookname,String author) {//å�̸��� �۰� �Ű������� �޴� ������
		this.author=author;
		this.bookname=bookname;
	}
	
	public String getbookname() {
		return bookname;
	}
	
	public void setbookname(String bookname) {
		this.bookname=bookname;
	}
	
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	
	public void showbookinfo() {
		System.out.println("å�̸�: "+bookname+", �۰�: "+author);
	}
	

}
