package java_7;

public class objectcopy3 {
	//���� ����
	public static void main(String[] args) {
		Book[] bookarray1=new Book[3];
		Book[] bookarray2=new Book[3];
		
		bookarray1[0]=new Book("å11","�۰�11");
		bookarray1[1]=new Book("å12","�۰�12");
		bookarray1[2]=new Book("å13","�۰�13");
		
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

		
		bookarray1[0].setbookname("å111");
		bookarray1[0].setauthor("�۰�111");
		
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
