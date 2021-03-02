package objects;

public class Student {
	
	// 속성(필드) 타입선언-> 필드이름
	String studentNo;
	int grade;
	int manth;
	int eng;
	public int math;
	


	// 생성자 : 필드값을 초기화.
	Student() {
		
	}
	Student(String studentNo) {
		this.studentNo = studentNo;
	}
	
	Student(int grade, int eng, int math) {
		this.grade = grade;
		this.eng = eng;
		this.math = math;
		
	}
	// 기능(메소드)
	void study() {
		System.out.println("공부합니다.");
	}

	void run() {
		System.out.println("운동합니다.");
	}
	
	void introuduce() {
		System.out.println("학번" + studentNo + "학년" + eng + "영어점수" + math + "수학점수");
	}
}
