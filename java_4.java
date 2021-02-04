package java_4;

public class java_4 {

	public static void main(String[] args) {
	
		//(1)
	int num1=10;
	int num2=2;
	char op='+';
	
	
	switch(op) {
	
	case '+':
		System.out.println(num1+num2);
		break;
		
	case '-':
		System.out.println(num1-num2);
		break;
		
	case '*':
		System.out.println(num1*num2);
		break;	
		
	case '/':
		System.out.println(num1/num2);
		break;
	}
	
	
	//(2)
	int i;
	int num;
	for(i=1;i<10;i++) {
		if(i%2!=0) continue;
		else {
			for (num=1;num<10;num++) {
				System.out.println(i+"*"+num+"="+(num*i));
			}
			System.out.println( );	
		}
	}
	
	//(3)
	int dan;
	int times;
	
	for(dan=1;dan<10;dan++) {
		for(times=1;times<10;times++) {
			if(times>dan) break;
			else System.out.println(dan+"*"+times+"="+dan*times);
		}
		System.out.println( );
	}
	
	//(4)
	int k;
	int j;
	int r;
	for (k=0;k<4;k++) {
		for(j=0;j<3-k;j++) System.out.print(" ");
		for(j=0;j<2*k+1;j++)System.out.print("*");
		System.out.println("");
	}
	
	
	//(5)
	int k1;
	int j1;
	for (k1=0;k1<4;k1++) {
		for(j1=0;j1<3-k1;j1++) System.out.print(" ");
		for(j1=0;j1<2*k1+1;j1++)System.out.print("*");
		System.out.println("");
	}
	for (k1=3;k1>0;k1--) {
		for(j1=3-k1;j1>=0;j1--) System.out.print(" ");
		for(j1=0;j1<2*k1-1;j1++)System.out.print("*");
		System.out.println("");
	}
	
	}
	
}
