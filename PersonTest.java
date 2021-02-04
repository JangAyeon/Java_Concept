package java_5_4;

public class PersonTest {
	public static void main(String[] args) {
		Person kim=new Person();
		kim.name="김유신";
		kim.weight=85.5F;
		kim.height=180.0F;
		
		Person lee=new Person("이순신",175,75);
	}
}
