package java_7;

public class BookArray {
	
	public static void main(String[] args) {
	Book[] lib=new Book[5];
	
	//인스턴스 생성 후 배열에 저장
	lib[0]=new Book("책이름1","작가1");
	lib[1]=new Book("책이름2","작가2");
	lib[2]=new Book("책이름3","작가3");
	lib[3]=new Book("책이름4","작가4");
	lib[4]=new Book("책이름5","작가5");
	
	for(int i=0;i<lib.length;i++) {
		lib[i].showbookinfo();
	}
	
	for(int i=0;i<lib.length;i++) {
		System.out.println(lib[i]);
	}
	
	}
}
