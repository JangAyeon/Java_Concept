package java_5_2;

public class Person {
	
	int age;
	String name;
	boolean ismarried;
	int sib;
	
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public boolean getmarr() {
		return ismarried;
	}
	public int getsib() {
		return sib;
	}
	
	public static void main(String[] args) {
		Person ppl=new Person();
		ppl.age=40;
		ppl.name="James";
		ppl.ismarried=true;
		ppl.sib=4;
		
		System.out.println("�� ����� ����: "+ppl.getage());
		System.out.println("�� ����� �̸�: "+ppl.getname());
		System.out.println("�� ����� ��ȥ ����: "+ppl.getmarr());
		System.out.println("�� ����� �ڳ� ��: "+ppl.getsib());
	}

}
