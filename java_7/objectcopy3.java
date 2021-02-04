package java_7;

public class objectcopy3 {
	//깊은 복사
	public static void main(String[] args) {
		Book[] bookarray1=new Book[3];
		Book[] bookarray2=new Book[3];
		
		bookarray1[0]=new Book("책11","작가11");
		bookarray1[1]=new Book("책12","작가12");
		bookarray1[2]=new Book("책13","작가13");
		
		bookarray2[0]=new Book();
		bookarray2[1]=new Book();
		bookarray2[2]=new Book();
		
		for(int i=0;i<bookarray1.length;i++) {
			bookarray2[i].setbookname(bookarray1[i].getbookname());
			bookarray2[i].setauthor(bookarray1[i].getauthor());
		}
		
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showbookinfo();
		}

		
		bookarray1[0].setbookname("책111");
		bookarray1[0].setauthor("작가111");
		
		System.out.println("=======book1========");
		for(int i=0;i<bookarray1.length;i++) {
			bookarray1[i].showbookinfo();
		}
		System.out.println("=======book2========");
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showbookinfo();
		}
	}

}
