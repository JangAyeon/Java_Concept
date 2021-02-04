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
		
		System.out.println("이 사람의 나이: "+ppl.getage());
		System.out.println("이 사람의 이름: "+ppl.getname());
		System.out.println("이 사람의 결혼 여부: "+ppl.getmarr());
		System.out.println("이 사람의 자녀 수: "+ppl.getsib());
	}

}
