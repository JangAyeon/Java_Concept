package first;


public class chap2 {
	
		
		public static void main(String[] args) {
			

			//(1)화면에 출력함
			System.out.println("Hello,Java");

			//(2)변수 선언, 대입, 출력
			int level; //변수 선언
			level=10; //변수 대입
			System.out.println(level); //값 출력
			
			int age;
			age=22;
			System.out.println(age);
			
			//(3)변수 초기화
			int age=10; //변수 초기화 - 선언 & 대입
			System.out.println(age); //값 출력

		}

	}




public class chap3 {
	
	
	public static void main(String[] args) {
		
		//(1)자료형이 다른 정수끼리 더하기
		short sval=10; //2 byte 변수
		byte bval=20; //1 byte 변수
		
		System.out.println(sval+bval);
		/*정수의 default는 int형!!
		프로그램 실행되어 정수 값 연산 시 => 4 byte 기본단위로 사용
		정수는 int형으로 변환되고 연산 결과도 int형으로 저장됨
		(byte나 short등은 편리한 연산을 위해 내부적으로 int형으로 변환함)
		*/
		
		
		//(2)정수 자료형
		/*int num1=12345678900; 
		 	-> 오류 : int형의 표현 범위 넘김
		long num2=12345678900; 
			-> 오류 : 정수의 기본형은 int형인데 표현 범위 넘김*/
		
		long var1=12345678900L; 
		//식별자 L을 통해 이 정수를 long으로 처리하라고 컴파일러에게 공지
		
		long var2=100;
		//100 정수는 int형의 범위를 넘지 않아 int형이 long형으로 자동으로 변환됨 -> int형 내부 값은 식별자 필요 x
		
		//(3)문자 자료형
		char ch1='A'; //2 byte, 변수에 그 문자에 해당하는 아스키코드값이 저장됨
		System.out.println(ch1); //문자 출력
		System.out.println((int)ch1); //아스키코드 값 출력
		
		char ch2=66;
		System.out.println(ch2); //문자 출력
		
		char ch3=67;
		System.out.println(ch3); //문자 출력
		System.out.println((char)ch3); //문자 출력
		
		char ch4='한';
		char ch5='\uD55C'; //'한'의 유니코드 값 : 16진수 4비트가 4개 -> 총 2바이트
		System.out.println(ch4);
		System.out.println(ch5);
		
		int a=65;
		int b=-66;
		char a2=65;
		//char b2=-66; 문자형 변수에 음수 넣으면 오류 발생
		
		System.out.println((char)a);
		System.out.println((char)b); //음수값을 char형으로 출력시 알 수 없는 문자(?) 나옴
		System.out.println(a2);
		
		//(4)실수형 자료형
		double dnum=3.14;
		float fnum=3.14F;
		/*실수형의 default는 double형 
		 * -> 식별자F를 통해  float형 값이 대입된다고 표현*/
		
		double c=1;
		for(int i=0;i<10000;i++) {
			c+=0.1;
		}
		System.out.println(c);
		//1001이 딱 나오는게 아닌 약간의 오차 발생
		
		//(5)논리 자료형
		boolean isMarried=true;
		System.out.println(isMarried);
		
		//(6)자료형 추론 var
		var i=10;//int
		var j=10.0;//float
		var k="hello";//String
		
		k="hi";//String k에 다른 문자열 대입가능
		//k=80; ->k는 이미 String으로 사용되었기 때문에 정수 값 대입 불가능 
		
	}
}

public class chap4 {
	public static void main(String[] args) {
		
		//(1)상수와 리터럴
		final int MAX_NUM=100; //선언과 동시에 초기화
		final int MIN_NUM;
		MIN_NUM=10; // 해당 변수 사용하기 전에 초기화 해줘야함 
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MIN_NUM=50; -> 오류 : 상수는 값 변경 불가능 
	}
}


public class chap5{
	/*<형 변환 원칙>
	 (1)작은 바이트 -> 큰 바이트
	 (2)덜 정밀한 자료형 -> 더 정밀한 자료형*/
	
	public static void main(String[] args) {
		
		//(1)묵시적 자료형
		byte bnum=10;
		int inum=bnum; //byte형이 int형 변수로 대입
		System.out.println(bnum);
		System.out.println(inum);
		
		int inum2=20;
		float fnum=inum2;//int형이 float형 변수로 대입
		System.out.println(inum);
		System.out.println(fnum);
		
		double dnum;
		dnum=fnum+inum;
		System.out.println(dnum);
		
		//(2)명시적 형변환
		int inum3=1000;
		byte bnum2=(byte)inum3;
		System.out.println(inum3);
		System.out.println(bnum2);
		//출력값이 전형 상관없는 -24 나옴 -> btye형의 범위를 1000이 넘었기 때문
		
		double dnum3=3.14;
		int inum4=(int)dnum3;
		System.out.println(dnum3);
		System.out.println(inum4);
		//실수 자료형을 정수 자료형으로 변환 -> 소수점 이하 부분 생략
		
		double w=1.2;
		float j=0.9f;
		
		int e=(int)w+(int)j; // 두 실수가 각각 형변환 되어서 덧셈
		System.out.println(e);
		int q=(int)(w+j); // 두 실수가 덧셈하고 그 결과가 형변환됨
		System.out.println(q);
	}

}