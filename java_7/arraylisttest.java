package java_7;
import java.util.ArrayList;

public class arraylisttest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("책11","작가11"));
		library.add(new Book("책12","작가12"));
		library.add(new Book("책13","작가13"));
		library.add(new Book("책14","작가14"));
		
		for(int i=0;i<library.size();i++) {
			Book book=library.get(i);
			book.showbookinfo();
		}
		
		System.out.println();
		System.out.println("=========향상된 for문===========");
		for(Book book:library) {
			book.showbookinfo();
		}
	}
}
