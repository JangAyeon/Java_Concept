package java_7;
import java.util.ArrayList;

public class arraylisttest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("å11","�۰�11"));
		library.add(new Book("å12","�۰�12"));
		library.add(new Book("å13","�۰�13"));
		library.add(new Book("å14","�۰�14"));
		
		for(int i=0;i<library.size();i++) {
			Book book=library.get(i);
			book.showbookinfo();
		}
		
		System.out.println();
		System.out.println("=========���� for��===========");
		for(Book book:library) {
			book.showbookinfo();
		}
	}
}
