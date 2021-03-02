package objects;

public class Student1 {
	
	private String name;
	private int math;
	private int eng;

	 Student1() {
		
	}
	
	Student1(String name, int math, int eng) {
		this.name = name;
		this.math = math;
		this.eng = eng;
		
	}
		
	Student[] student = new Student[3];
		
		void showinfo() {
			System.out.println("이름: " + name + ", 영어: " + eng + ",수학:" +math + ",합계:" + (math+eng));
		}

}
public void setName(String name) {
this.name = name;
}
public void setEng(int eng) {
	if(eng <0) {
		this.eng = 0;
	} else {
		
	this.eng = eng;
	
}
public void setMath(int math) {
	this.math = math;
}
}