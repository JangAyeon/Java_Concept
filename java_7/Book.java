package java_7;

public class Book {
	
	private String bookname;
	private String author;
	
	public Book() {};//디폴트 생성자
	
	public Book(String bookname,String author) {//책이름과 작가 매개변수로 받는 생성자
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
		System.out.println("책이름: "+bookname+", 작가: "+author);
	}
	

}
