package java_7;


public class restudenttest{

	public static void main(String[] args) {
		
		restudent Lee=new restudent(101,"LEE");
		Lee.addresubject("����",100);
		Lee.addresubject("����",90);
		Lee.addresubject("����",80);
		
		
		restudent Hee=new restudent(102,"HEE");
		Hee.addresubject("����",40);
		Hee.addresubject("����",50);
		Hee.addresubject("����",70);
		
		Lee.showstudentinfo();
		System.out.println("===============");
		Hee.showstudentinfo();
		
	}
	
	
}
