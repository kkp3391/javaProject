package students;

import students.Student;

public interface Service {
	   public  Student[] getStudentList() ;
		
	 // 전체 목록 
	   public Student getStudent(int stdNo); // 한건 조회
	   public void createStudent(Student student); // 게시글 작성
	   public void modifyStudent(Student student); // 글 수정
	   public void removeStudent(Student student); // 글 삭제
}
