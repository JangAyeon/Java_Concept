package java_7;

public class BookArray {
	
	public static void main(String[] args) {
	Book[] lib=new Book[5];
	
	//�ν��Ͻ� ���� �� �迭�� ����
	lib[0]=new Book("å�̸�1","�۰�1");
	lib[1]=new Book("å�̸�2","�۰�2");
	lib[2]=new Book("å�̸�3","�۰�3");
	lib[3]=new Book("å�̸�4","�۰�4");
	lib[4]=new Book("å�̸�5","�۰�5");
	
	for(int i=0;i<lib.length;i++) {
		lib[i].showbookinfo();
	}
	
	for(int i=0;i<lib.length;i++) {
		System.out.println(lib[i]);
	}
	
	}
}
