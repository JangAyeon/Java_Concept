package java_2;

public class java_2 {
	
	public static void main(String[] args) {

   //기본 연산자
 

	//(1)부호 연산자
	int num=10;
	System.out.println(num);
	System.out.println(-num);
	//num 값 10에 -가 붙어 -10이 출력되지만
	System.out.println(num);
	//num값 자체가 -10으로 바뀐 것은 아님. 그냥 10 그대로임.
	
	
	//(2)산술 연산자
	int mathscore=90;
	int engscore=100;
	int korscore=70;
	
	int totalscore=mathscore+engscore+korscore;
	//총점 구하기
	System.out.println(totalscore);
	
	double avg=totalscore/3;
	//평균 구하기
	System.out.println(avg);
	
	//(3)증감연산자
	int num1=100;
	int plus_var=++num1;
	System.out.println(num1);
	System.out.println(plus_var);
	
	int minus_var=--num1;
	System.out.println(num1);
	System.out.println(minus_var);
	
	int var_plus=num1++;
	System.out.println(num1);
	System.out.println(var_plus);
	System.out.println(num1);
	
	int var_minus=num1--;
	System.out.println(num1);
	System.out.println(var_minus);
	System.out.println(num1);
	
		
	//(3)관계연산자
	int val=27;
	Boolean value=(val>25);
	System.out.println(value);
	
	int i=10;
	int j=20;
	boolean flag=(i>0)&&(j>0);
	System.out.println(flag);
	
	flag=(i<0)&&(j>0);
	System.out.println(flag);
	
	flag=(i<0)||(j>0);
	System.out.println(flag);
	
	//단락 회로 평가(1)
	int num11=10;
	int i1=2;
	
	boolean value1=((num11+=10)<10)&&((i1+=2)<10);
	System.out.println(value1);
	System.out.println(num11);
	System.out.println(i1);
	//논리 곱에서 앞의 조건문이 거짓이므로 뒤의 조건문은 실행되지 않음
	
	
	value1=((num11+=10)>10)||((i1+=2)<10);
	System.out.println(value1);
	System.out.println(num11);
	System.out.println(i1);
	//논리 합에서 앞의 조건문이 이미 참이라 뒤의 조건문은 실행되지 않음

	//단락 회로 평가(2)
	int num2=5;
	int i2=10;
	
	boolean value2=((num2*=10)>45)||((i-=5)<10);
	System.out.println(value2);
	System.out.println(num2);
	System.out.println(i);
	
	//(4)조건연산자
	int fatherage=50;
	int motherage=40;
	char ch=(fatherage>motherage)? 'T':'F';
	System.out.println(ch);
	
	int num3=10;
	boolean iseven;
	iseven=(num3%2==0)?true:false;
	System.out.println(iseven);



	//(1)비트연산자
	int q=5;//00000101
	int w=10;//00001010
	int result=q&w;//00000000
	System.out.println(result);//0
	
	result=q|w;//00001111
	System.out.println(result);//15
	
	result=q^w;//00001111
	System.out.println(result);//15
	
	result=~w;//11110101
	//부호비트가 1로 음수임, 10진수로 변환하면 11임 => -11
	System.out.println(result);
	
	//(2)비트 이동 연산자
	
	int e=5;//0000101
	e=e<<2;//0010100 => 20
	//왼쪽으로 n번 이동 = 2^n 곱하기
	System.out.println(e);
	
	int r=10;//00001010
	r=r>>2;//00000010 => 2
	//오른쪽으로 n번 이동 = 2^n 나누기 (몫)
	System.out.println(r);
	
	int t=0B00000101;//5를 8비트 2진수로 표현
	
	System.out.println(t<<2);
	System.out.println(t>>2);
	System.out.println(t>>>2);
	//>>>연산자는 동일하게 비트를 오른쪽으로 이동
	//부호비트와 상관없이 0으로 채움
	
	System.out.println(t);
	//비트 연산한 것을 t에 대입하지 않아 기존 값 그대로임
	
	t=t<<2;
	System.out.println(t);

	}

}
