package java_7;

import java.util.ArrayList;

public class restudent {


	int studentid;
	String studentname;
	ArrayList<resubject> resubjectlist;
	
	public restudent(int studentid,String studentname) {
		this.studentid=studentid;
		this.studentname=studentname;
		resubjectlist=new ArrayList<resubject>();
	}
	
	public void addresubject(String name,int score) {
		resubject subject=new resubject();
		subject.setname(name);
		subject.setscore(score);
		resubjectlist.add(subject);
	}
	public void showstudentinfo() {
		int total=0;
		for(resubject s:resubjectlist) {
			total+=s.getscore();
			System.out.println("�л�: "+studentname+"��"+s.getname()+"���� ������ "+s.getscore()+"�Դϴ�.");
		}
		System.out.println("�л�"+studentname+"�� ������ "+ total +" �Դϴ�.");
	}
}
