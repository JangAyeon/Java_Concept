package java_7;
import java.util.ArrayList;
public class studentarraylist {

	public static void main(String[] args) {
		ArrayList<student> stu=new ArrayList<student>();
		stu.add(new student(101,"�ƿ�"));
		stu.add(new student(102,"�Ͽ�"));
		stu.add(new student(103,"�忬"));
		
		for(int i=0;i<stu.size();i++) {
			student student=stu.get(i);
			student.showstudentinfo();
		}
		System.out.println();
		System.out.println("===���� for��===");
		for(student j:stu) {
			j.showstudentinfo();
		}
	}
}
