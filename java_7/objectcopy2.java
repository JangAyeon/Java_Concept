package java_7;

public class objectcopy2 {
	
	//얕은 복사
	
	public static void main(String[] args) {
		Book[] bookarray1=new Book[3];
		Book[] bookarray2=new Book[3];
		
		bookarray1[0]=new Book("책11","작가11");
		bookarray1[1]=new Book("책12","작가12");
		bookarray1[2]=new Book("책13","작가13");
		
		
		System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
		
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showbookinfo();
		}
		
		//bookarray1 배열의 첫번째 요소 값 변경
		bookarray1[0].setbookname("책111");
		bookarray1[0].setauthor("작가111");
		
		System.out.println("============book1============");
		for(int i=0;i<bookarray1.length;i++) {
			bookarray1[i].showbookinfo();
		}
		
		//bookarray2 배열의 요소 값도 변경됨
		System.out.println("============book2============");
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showbookinfo();
		}
		
	}

}
