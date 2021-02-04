package java_7;

public class student {
	int studentid;
	String name;
	
	public student() {};
	public student(int studentid,String name) {
		this.studentid=studentid;
		this.name=name;
	}
	
	public void setstudentid(int studentid) {
		this.studentid=studentid;
	}
	public int getstudentid() {
		return studentid;
	}

	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public void showstudentinfo() {
		System.out.println(studentid+", "+name);
	}
}
