package java_7;

public class array {
	
	public static void main(String[] args) {
		
		int[] num=new int[] {100,101,102};
		for (int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		double[] data=new double[5];//실수형 배열은 초기화 값 0.0
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		double[] newdata=new double[5];
		int size=0;
		newdata[0]=10.0;size++;
		newdata[1]=20.0;size++;
		newdata[2]=30.0;size++;
		
		for (int i=0;i<size;i++) { //유효한 배열의 요소 값 출력 
			System.out.println(newdata[i]);
		}
		
		char[] alpha=new char[26];//알파벳 문자 저장 배열 & 아스키 코드
		char ch='A';
		for(int i=0;i<alpha.length;i++,ch++) {
			alpha[i]=ch;
			System.out.println("문자: "+alpha[i]+"숫자: "+(int)alpha[i]);
		}
		
		
	}

}
