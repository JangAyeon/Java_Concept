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
		mall.date="2018�� 3�� 12��";
		mall.name="ȫ���";
		mall.proid="PD0345-12";
		mall.add="����� �������� ���ǵ� 20����";
		
		System.out.println("�ֹ���ȣ: "+mall.getnum());
		System.out.println("�ֹ��� ID: "+mall.getid());
		System.out.println("�ֹ� ��¥: "+mall.getdate());		
		System.out.println("�ֹ��� �̸�: "+mall.getname());		
		System.out.println("�ֹ��� ��ǰ��ȣ: "+mall.getproid());	
		System.out.println("��� �ּ�: "+mall.getadd());	
	}
}
