package objects;

public class ObjectExample {
	public static void main(String[] args) {
		Student student = new Student();
		student.studentNo = "s12345";
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		student.study();
		student.run();
		student.introuduce();
	

	Student student1 = new Student();
//	student.studentNo = "s12345";
	student.grade = 2;
	student.eng = 80;
	student.math = 85;
	student.study();
	student.run();
	student.introuduce();
	
	Student student2 = new Student(4, 70, 80);
	student2.studentNo = "s23469";
			student2.study();
			student2.run();
			student2.introuduce();
}
}