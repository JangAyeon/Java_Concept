package java_5;


/*(1)�л� Ŭ���� �����
public class java_5 {
	//class: Ŭ������ ����� �����
	 //java_5: Ŭ���� �̸� -> �ڹ� ���� �̸��� ���ƾ��t
	
	int studentId;
	String studentName;
	int grade;
	String address;
	//��� ���� : Ŭ���� ���ο� �����Ͽ� ��ü �Ӽ��� ��Ÿ���� ����
	
	public void showinfo() {
		//�޼��� : Ŭ���� ������ ��� ������ ����� Ŭ���� ��� ����
		System.out.println(studentName+","+address);
	}
}*/


/*(2)Person Ŭ���� �����
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
			System.out.println("������ ���� �Ұ���");
			return 0;//������ ���� �Ұ���
		}
		else {
			return n1/n2;
		}
	}
}

