package first;


public class chap2 {
	
		
		public static void main(String[] args) {
			

			//(1)ȭ�鿡 �����
			System.out.println("Hello,Java");

			//(2)���� ����, ����, ���
			int level; //���� ����
			level=10; //���� ����
			System.out.println(level); //�� ���
			
			int age;
			age=22;
			System.out.println(age);
			
			//(3)���� �ʱ�ȭ
			int age=10; //���� �ʱ�ȭ - ���� & ����
			System.out.println(age); //�� ���

		}

	}




public class chap3 {
	
	
	public static void main(String[] args) {
		
		//(1)�ڷ����� �ٸ� �������� ���ϱ�
		short sval=10; //2 byte ����
		byte bval=20; //1 byte ����
		
		System.out.println(sval+bval);
		/*������ default�� int��!!
		���α׷� ����Ǿ� ���� �� ���� �� => 4 byte �⺻������ ���
		������ int������ ��ȯ�ǰ� ���� ����� int������ �����
		(byte�� short���� ���� ������ ���� ���������� int������ ��ȯ��)
		*/
		
		
		//(2)���� �ڷ���
		/*int num1=12345678900; 
		 	-> ���� : int���� ǥ�� ���� �ѱ�
		long num2=12345678900; 
			-> ���� : ������ �⺻���� int���ε� ǥ�� ���� �ѱ�*/
		
		long var1=12345678900L; 
		//�ĺ��� L�� ���� �� ������ long���� ó���϶�� �����Ϸ����� ����
		
		long var2=100;
		//100 ������ int���� ������ ���� �ʾ� int���� long������ �ڵ����� ��ȯ�� -> int�� ���� ���� �ĺ��� �ʿ� x
		
		//(3)���� �ڷ���
		char ch1='A'; //2 byte, ������ �� ���ڿ� �ش��ϴ� �ƽ�Ű�ڵ尪�� �����
		System.out.println(ch1); //���� ���
		System.out.println((int)ch1); //�ƽ�Ű�ڵ� �� ���
		
		char ch2=66;
		System.out.println(ch2); //���� ���
		
		char ch3=67;
		System.out.println(ch3); //���� ���
		System.out.println((char)ch3); //���� ���
		
		char ch4='��';
		char ch5='\uD55C'; //'��'�� �����ڵ� �� : 16���� 4��Ʈ�� 4�� -> �� 2����Ʈ
		System.out.println(ch4);
		System.out.println(ch5);
		
		int a=65;
		int b=-66;
		char a2=65;
		//char b2=-66; ������ ������ ���� ������ ���� �߻�
		
		System.out.println((char)a);
		System.out.println((char)b); //�������� char������ ��½� �� �� ���� ����(?) ����
		System.out.println(a2);
		
		//(4)�Ǽ��� �ڷ���
		double dnum=3.14;
		float fnum=3.14F;
		/*�Ǽ����� default�� double�� 
		 * -> �ĺ���F�� ����  float�� ���� ���Եȴٰ� ǥ��*/
		
		double c=1;
		for(int i=0;i<10000;i++) {
			c+=0.1;
		}
		System.out.println(c);
		//1001�� �� �����°� �ƴ� �ణ�� ���� �߻�
		
		//(5)�� �ڷ���
		boolean isMarried=true;
		System.out.println(isMarried);
		
		//(6)�ڷ��� �߷� var
		var i=10;//int
		var j=10.0;//float
		var k="hello";//String
		
		k="hi";//String k�� �ٸ� ���ڿ� ���԰���
		//k=80; ->k�� �̹� String���� ���Ǿ��� ������ ���� �� ���� �Ұ��� 
		
	}
}

public class chap4 {
	public static void main(String[] args) {
		
		//(1)����� ���ͷ�
		final int MAX_NUM=100; //����� ���ÿ� �ʱ�ȭ
		final int MIN_NUM;
		MIN_NUM=10; // �ش� ���� ����ϱ� ���� �ʱ�ȭ ������� 
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MIN_NUM=50; -> ���� : ����� �� ���� �Ұ��� 
	}
}


public class chap5{
	/*<�� ��ȯ ��Ģ>
	 (1)���� ����Ʈ -> ū ����Ʈ
	 (2)�� ������ �ڷ��� -> �� ������ �ڷ���*/
	
	public static void main(String[] args) {
		
		//(1)������ �ڷ���
		byte bnum=10;
		int inum=bnum; //byte���� int�� ������ ����
		System.out.println(bnum);
		System.out.println(inum);
		
		int inum2=20;
		float fnum=inum2;//int���� float�� ������ ����
		System.out.println(inum);
		System.out.println(fnum);
		
		double dnum;
		dnum=fnum+inum;
		System.out.println(dnum);
		
		//(2)����� ����ȯ
		int inum3=1000;
		byte bnum2=(byte)inum3;
		System.out.println(inum3);
		System.out.println(bnum2);
		//��°��� ���� ������� -24 ���� -> btye���� ������ 1000�� �Ѿ��� ����
		
		double dnum3=3.14;
		int inum4=(int)dnum3;
		System.out.println(dnum3);
		System.out.println(inum4);
		//�Ǽ� �ڷ����� ���� �ڷ������� ��ȯ -> �Ҽ��� ���� �κ� ����
		
		double w=1.2;
		float j=0.9f;
		
		int e=(int)w+(int)j; // �� �Ǽ��� ���� ����ȯ �Ǿ ����
		System.out.println(e);
		int q=(int)(w+j); // �� �Ǽ��� �����ϰ� �� ����� ����ȯ��
		System.out.println(q);
	}

}