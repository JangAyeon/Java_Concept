package java_7;

public class twodimension2 {
	public static void main(String[] args) {
	char [][] alpha= new char [13][2];
	char ch='A';
	alpha[0][0]=ch;
	for(int i=0;i<alpha.length;i++) {
		for(int j=0;j<alpha[i].length;j++,ch++) {
			alpha[i][j]=ch;
			System.out.println(alpha[i][j]);
		}
	}

}
}