package java_7;

public class objectcopy2 {
	
	//���� ����
	
	public static void main(String[] args) {
		Book[] bookarray1=new Book[3];
		Book[] bookarray2=new Book[3];
		
		bookarray1[0]=new Book("å11","�۰�11");
		bookarray1[1]=new Book("å12","�۰�12");
		bookarray1[2]=new Book("å13","�۰�13");
		
		
		System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
		
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showbookinfo();
		}
		
		//bookarray1 �迭�� ù��° ��� �� ����
		bookarray1[0].setbookname("å111");
		bookarray1[0].setauthor("�۰�111");
		
		System.out.println("============book1============");
		for(int i=0;i<bookarray1.length;i++) {
			bookarray1[i].showbookinfo();
		}
		
		//bookarray2 �迭�� ��� ���� �����
		System.out.println("============book2============");
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showbookinfo();
		}
		
	}

}
