package java_2;

public class java_2 {
	
	public static void main(String[] args) {

   //�⺻ ������
 

	//(1)��ȣ ������
	int num=10;
	System.out.println(num);
	System.out.println(-num);
	//num �� 10�� -�� �پ� -10�� ��µ�����
	System.out.println(num);
	//num�� ��ü�� -10���� �ٲ� ���� �ƴ�. �׳� 10 �״����.
	
	
	//(2)��� ������
	int mathscore=90;
	int engscore=100;
	int korscore=70;
	
	int totalscore=mathscore+engscore+korscore;
	//���� ���ϱ�
	System.out.println(totalscore);
	
	double avg=totalscore/3;
	//��� ���ϱ�
	System.out.println(avg);
	
	//(3)����������
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
	
		
	//(3)���迬����
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
	
	//�ܶ� ȸ�� ��(1)
	int num11=10;
	int i1=2;
	
	boolean value1=((num11+=10)<10)&&((i1+=2)<10);
	System.out.println(value1);
	System.out.println(num11);
	System.out.println(i1);
	//�� ������ ���� ���ǹ��� �����̹Ƿ� ���� ���ǹ��� ������� ����
	
	
	value1=((num11+=10)>10)||((i1+=2)<10);
	System.out.println(value1);
	System.out.println(num11);
	System.out.println(i1);
	//�� �տ��� ���� ���ǹ��� �̹� ���̶� ���� ���ǹ��� ������� ����

	//�ܶ� ȸ�� ��(2)
	int num2=5;
	int i2=10;
	
	boolean value2=((num2*=10)>45)||((i-=5)<10);
	System.out.println(value2);
	System.out.println(num2);
	System.out.println(i);
	
	//(4)���ǿ�����
	int fatherage=50;
	int motherage=40;
	char ch=(fatherage>motherage)? 'T':'F';
	System.out.println(ch);
	
	int num3=10;
	boolean iseven;
	iseven=(num3%2==0)?true:false;
	System.out.println(iseven);



	//(1)��Ʈ������
	int q=5;//00000101
	int w=10;//00001010
	int result=q&w;//00000000
	System.out.println(result);//0
	
	result=q|w;//00001111
	System.out.println(result);//15
	
	result=q^w;//00001111
	System.out.println(result);//15
	
	result=~w;//11110101
	//��ȣ��Ʈ�� 1�� ������, 10������ ��ȯ�ϸ� 11�� => -11
	System.out.println(result);
	
	//(2)��Ʈ �̵� ������
	
	int e=5;//0000101
	e=e<<2;//0010100 => 20
	//�������� n�� �̵� = 2^n ���ϱ�
	System.out.println(e);
	
	int r=10;//00001010
	r=r>>2;//00000010 => 2
	//���������� n�� �̵� = 2^n ������ (��)
	System.out.println(r);
	
	int t=0B00000101;//5�� 8��Ʈ 2������ ǥ��
	
	System.out.println(t<<2);
	System.out.println(t>>2);
	System.out.println(t>>>2);
	//>>>�����ڴ� �����ϰ� ��Ʈ�� ���������� �̵�
	//��ȣ��Ʈ�� ������� 0���� ä��
	
	System.out.println(t);
	//��Ʈ ������ ���� t�� �������� �ʾ� ���� �� �״����
	
	t=t<<2;
	System.out.println(t);

	}

}
