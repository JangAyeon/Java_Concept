package java_3;

public class java_3 {
	
	public static void main(String[] args) {
		
	//(1)if-else if-else ��
	int age=9;
	int charge;
	
	if(age<8) {
		charge=1000;
		System.out.println("���� �� �Ƶ�");
	}
	else if(age<14) {
		charge=2000;
		System.out.println("�ʵ��л�");
	}
	else if(age<20) {
		charge=2500;
		System.out.println("��,���л�");
	}
	else {
		charge=3000;
		System.out.println("�Ϲ���");
	}
	System.out.println("�����"+charge+"�� �Դϴ�.");
	
	
	
	//(2)if-if��
	if(age<8) {
		charge=1000;
		System.out.println("���� �� �Ƶ�");
	}
	if(age<14) {
		charge=2000;
		System.out.println("�ʵ��л�");
	}
	if(age<20) {
		charge=2500;
		System.out.println("��,���л�");
	}
	else {
		charge=3000;
		System.out.println("�Ϲ���");
	}
	System.out.println("�����"+charge+"�� �Դϴ�.");
	
	//(3)������ ���� ���� �ο�
	int score=75;
	char grade;
	if(100>=score && score<=90) {
		grade='A';
	}
	else if(90>score && score>=80) {
		grade='B';
	}
	else if(80>score && score>=70) {
		grade='C';
	}
	else if(70>score && score>=60) {
		grade='D';
	}
	else {
		grade='F';
	}
	System.out.println("����: "+grade);
	
	//(4)���ǹ��� ���� ������
	if (score>=90) {
		grade='A';
	}
	else {
		grade='B';
	}
	System.out.println("����: "+grade);
	
	grade=(score>=90)?'A':'B';
	System.out.println("����: "+grade);
	
	//(5)switch-case
	int rank=1;
	char medal;
	
	switch(rank) {
	case 1: medal='G';
		break;
	case 2: medal='S';
		break;
	case 3:medal='B';
		break;
	default:
		medal='A';
	}
	System.out.println(rank+"�� �޴��� ����"+medal+"�Դϴ�.");
	
	//(6)switch-case�� ���ÿ� ���
	int mon=2;
	int day = 0;
	switch(mon) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12: day=31;
		break;
	case 4: case 6: case 9: case 11: day=30;
		break;
	case 2: day=28;
		break;
	}
	System.out.println(mon+"���� "+ day +"�� �Դϴ�.");
	
	
	//(7)switch-case�� break ���
	int rank1=2;
	char medal1;
	switch(rank1) {
	case 1:medal1='G';
	case 2:medal1='S';
	case 3:medal1='B';
	default:medal1='A';
	}
	System.out.println(rank1+"�� "+ medal1 +"�޴� �Դϴ�.");
	/*1�� �޴� ������ G�ε� ��� ����� A�� ���� 
	  -> break�� ��� rank1�� ���� ���ԵǾ 
	  switch�� ���������� �ʰ� �� ���������� ����Ǿ� ���Ե�*/
	
	//(8)case���� ���ڿ� ���
	String medal11="Gold";
	
	switch(medal11) {
	case "Gold":
		System.out.println("�ݸ޴�");
		break;
	case "Silver":
		System.out.println("���޴�");
		break;
	case "Bronze":
		System.out.println("���޴�");
		break;
	default:
		System.out.println("�޴� ����");
		break;
	}
	//(9)switch-case�� ����
	int floor=1;
	String shop = null;
	
	switch(floor) {
		case 1: shop="�౹";
			break;
		case 2: shop="�����ܰ�";
			break;
		case 3: shop="�Ǻΰ�";
			break;
		case 4: shop="ġ��";
			break;
		case 5: shop="ġ��";
			break;
	}
	System.out.println(shop);
	
	
	//(10)while�� : 1���� 10���� ���ϱ�
	int num=1;
	int sum=0;
	
	while(num<=10) {
		//���ǽ��� ���� ���� �ݺ�
		sum+=num;
		num++;
	}
	System.out.println("1���� 10������ ��: "+sum);
	
	//(11)do while��
	int num1=1;
	int sum1=0;
	
	do {
		//���ǽ��� ���� �ƴϴ��� ������ �� �� ����
		//�׷��� "1���� 10������ ���� 66"��� ��µ�
		sum+=num;
		num++;
	}while(num<=10);
	
	System.out.println("1���� 10������ ��: "+sum);
	
	
	//(12)for��
	int i;
	int sum11;
	for(i=1,sum11=0;i<=10;i++) {
		sum11+=i;
	}
	System.out.println("1���� 10������ ��: "+sum11);
	
	for(i=1;i<=10;i++) {
		System.out.println("�ȳ��ϼ���"+i);
	}
	
	//(13)��ø�� �ݺ���
	int dan;
	int times;
	
	for(dan=2;dan<=9;dan++) {
		for(times=1;times<=9;times++) {
			System.out.println(dan+"X"+times+"="+dan*times);
		}
		System.out.println();
	}
	
	//(14)continue��
	int total=0;
	int num11;
	
	for(num=1;num<=100;num++) {
		if(num%2==0)
			continue;
		total+=num;
	}
	System.out.println("1���� 100���� Ȧ���� ��: "+total);
	
	//(15)3�� ����� ���
	int r;
	for(r=1;r<=100;r++) {
		if(r%3!=0) {
			continue;
		}
		System.out.println(r);
	}
	//(16)
	int sum111=0;
	int num111=0;
	for(num111=0;;num111++) {
		sum+=num;
		if(sum>=100) break;
	}
	System.out.println("num: "+num);
	System.out.println("sum: "+sum);
	
	//(17) 1���� ������ �� �� ���� 500�� �Ѵ� �ڿ�����?
	int sum1111=0;
	int num1111;
	for(num1111=1;;num1111++) {
		sum1111+=num1111;
		if(sum1111>=500) 
			break;
		
	}
	System.out.println(sum1111);
	System.out.println(num1111);
	}
}
