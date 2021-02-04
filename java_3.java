package java_3;

public class java_3 {
	
	public static void main(String[] args) {
		
	//(1)if-else if-else 문
	int age=9;
	int charge;
	
	if(age<8) {
		charge=1000;
		System.out.println("취학 전 아동");
	}
	else if(age<14) {
		charge=2000;
		System.out.println("초등학생");
	}
	else if(age<20) {
		charge=2500;
		System.out.println("중,고학생");
	}
	else {
		charge=3000;
		System.out.println("일반인");
	}
	System.out.println("입장료"+charge+"원 입니다.");
	
	
	
	//(2)if-if문
	if(age<8) {
		charge=1000;
		System.out.println("취학 전 아동");
	}
	if(age<14) {
		charge=2000;
		System.out.println("초등학생");
	}
	if(age<20) {
		charge=2500;
		System.out.println("중,고학생");
	}
	else {
		charge=3000;
		System.out.println("일반인");
	}
	System.out.println("입장료"+charge+"원 입니다.");
	
	//(3)성적에 따라 학점 부여
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
	System.out.println("성적: "+grade);
	
	//(4)조건문과 조건 연산자
	if (score>=90) {
		grade='A';
	}
	else {
		grade='B';
	}
	System.out.println("성적: "+grade);
	
	grade=(score>=90)?'A':'B';
	System.out.println("성적: "+grade);
	
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
	System.out.println(rank+"등 메달의 색깔"+medal+"입니다.");
	
	//(6)switch-case문 동시에 사용
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
	System.out.println(mon+"월은 "+ day +"일 입니다.");
	
	
	//(7)switch-case문 break 사용
	int rank1=2;
	char medal1;
	switch(rank1) {
	case 1:medal1='G';
	case 2:medal1='S';
	case 3:medal1='B';
	default:medal1='A';
	}
	System.out.println(rank1+"등 "+ medal1 +"메달 입니다.");
	/*1등 메달 색깔은 G인데 출력 결과는 A가 나옴 
	  -> break문 없어서 rank1에 값에 대입되어도 
	  switch문 빠져나오지 않고 맨 마지막까지 실행되어 대입됨*/
	
	//(8)case문에 문자열 사용
	String medal11="Gold";
	
	switch(medal11) {
	case "Gold":
		System.out.println("금메달");
		break;
	case "Silver":
		System.out.println("은메달");
		break;
	case "Bronze":
		System.out.println("동메달");
		break;
	default:
		System.out.println("메달 없음");
		break;
	}
	//(9)switch-case문 연습
	int floor=1;
	String shop = null;
	
	switch(floor) {
		case 1: shop="약국";
			break;
		case 2: shop="정형외과";
			break;
		case 3: shop="피부과";
			break;
		case 4: shop="치과";
			break;
		case 5: shop="치과";
			break;
	}
	System.out.println(shop);
	
	
	//(10)while문 : 1부터 10까지 더하기
	int num=1;
	int sum=0;
	
	while(num<=10) {
		//조건식이 참인 동안 반복
		sum+=num;
		num++;
	}
	System.out.println("1부터 10까지의 합: "+sum);
	
	//(11)do while문
	int num1=1;
	int sum1=0;
	
	do {
		//조건식이 참이 아니더라도 무조건 한 번 수행
		//그래서 "1부터 10까지의 합은 66"라고 출력됨
		sum+=num;
		num++;
	}while(num<=10);
	
	System.out.println("1부터 10까지의 합: "+sum);
	
	
	//(12)for문
	int i;
	int sum11;
	for(i=1,sum11=0;i<=10;i++) {
		sum11+=i;
	}
	System.out.println("1부터 10까지의 합: "+sum11);
	
	for(i=1;i<=10;i++) {
		System.out.println("안녕하세요"+i);
	}
	
	//(13)중첩된 반복문
	int dan;
	int times;
	
	for(dan=2;dan<=9;dan++) {
		for(times=1;times<=9;times++) {
			System.out.println(dan+"X"+times+"="+dan*times);
		}
		System.out.println();
	}
	
	//(14)continue문
	int total=0;
	int num11;
	
	for(num=1;num<=100;num++) {
		if(num%2==0)
			continue;
		total+=num;
	}
	System.out.println("1부터 100까지 홀수의 합: "+total);
	
	//(15)3의 배수만 출력
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
	
	//(17) 1부터 더했을 때 그 합이 500이 넘는 자연수는?
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
