package java_5;


/*(1)학생 클래스 만들기
public class java_5 {
	//class: 클래스를 만드는 예약어
	 //java_5: 클래스 이름 -> 자바 파일 이름과 같아아햠
	
	int studentId;
	String studentName;
	int grade;
	String address;
	//멤버 변수 : 클래스 내부에 선언하여 객체 속성을 나타내는 변수
	
	public void showinfo() {
		//메서드 : 클래스 내부의 멤버 변수를 사용해 클래스 기능 구현
		System.out.println(studentName+","+address);
	}
}*/


/*(2)Person 클래스 만들기
public class Person{
	String name;
	int age;
	char gender;
	double weight;
	boolean married;
}*/

public class FunctionTest{
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		int sum=add(num1,num2);
		System.out.println(sum);
		int minus=sub(num1,num2);
		System.out.println(minus);
		int multi=mul(num1,num2);
		System.out.println(multi);
		int divide=div(num1,num2);
		System.out.println(divide);
	}
	
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static int sub(int n1,int n2) {
		return n1-n2;
	}
	public static int mul(int n1,int n2) {
		return n1*n2;
	}
	public static int div(int n1,int n2) {
		if (n2==0) {
			System.out.println("나눗셈 연산 불가능");
			return 0;//나눈셉 연산 불가능
		}
		else {
			return n1/n2;
		}
	}
}

