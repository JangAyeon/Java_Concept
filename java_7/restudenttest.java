package java_7;


public class restudenttest{

	public static void main(String[] args) {
		
		restudent Lee=new restudent(101,"LEE");
		Lee.addresubject("국어",100);
		Lee.addresubject("영어",90);
		Lee.addresubject("수학",80);
		
		
		restudent Hee=new restudent(102,"HEE");
		Hee.addresubject("국어",40);
		Hee.addresubject("영어",50);
		Hee.addresubject("수학",70);
		
		Lee.showstudentinfo();
		System.out.println("===============");
		Hee.showstudentinfo();
		
	}
	
	
}
