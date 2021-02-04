package java_7;

public class studentArray {
	
	public static void main(String[] args) {
		
		student[] stu=new student[3];
		
		stu[0]=new student(1001,"James");
		stu[1]=new student(1002,"Ann");
		stu[2]=new student(1003,"john");
		
		for(int i=0;i<stu.length;i++) {
			stu[i].showstudentinfo();
		}
	}                                      
}
