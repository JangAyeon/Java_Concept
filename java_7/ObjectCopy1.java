package java_7;

public class ObjectCopy1 {
	
	public static void main(String[] args) {
		Book[] bookarray1=new Book[3];
		Book[] bookarray2=new Book[3];
		
		bookarray1[0]=new Book("å1","�۰�1");
		bookarray1[1]=new Book("å2","�۰�2");
		bookarray1[2]=new Book("å3","�۰�3");
		
		System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showbookinfo();
		}
	}

}
