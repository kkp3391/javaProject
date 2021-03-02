package objects;

public class ClassExample {
	public static void main(String[] args) {

		Student1 s1 = new Student1("홍길동", 90, 85);
		Student1 s2 = new Student1("김길동", 88, 85);
		Student1 s3 = new Student1("이길동", 76, 90);
		Student1 s4 = new Student1();
		new Student1();
		
		
		Student1[] students = new Student1[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for (Student1 student : students) {
			student.showinfo();

		}
	}
}
