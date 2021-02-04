package java_5_3;

public class Shop {
	
	String num;
	String id;
	String date;
	String name;
	String proid;
	String add;
	
	public String getnum() {
		return num;
	}
	
	public String getid() {
		return id;
	}
	public String getdate() {
		return date;
	}
	public String getname() {
		return name;
	}
	public String getproid() {
		return proid;
	}
	public String getadd() {
		return add;
	}
	
	public static void main(String[] agrs) {
		Shop mall=new Shop();
		mall.num="201803120001";
		mall.id="abc123";
		mall.date="2018년 3월 12일";
		mall.name="홍길순";
		mall.proid="PD0345-12";
		mall.add="서울시 영등포구 여의동 20번지";
		
		System.out.println("주문번호: "+mall.getnum());
		System.out.println("주문자 ID: "+mall.getid());
		System.out.println("주문 날짜: "+mall.getdate());		
		System.out.println("주문자 이름: "+mall.getname());		
		System.out.println("주문자 상품번호: "+mall.getproid());	
		System.out.println("배송 주소: "+mall.getadd());	
	}
}
