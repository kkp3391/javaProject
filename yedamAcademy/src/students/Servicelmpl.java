package students;

import students.StudentDAO;

public class Servicelmpl implements Service {

	StudentDAO dao = new StudentDAO();
	
	public Student[] getStudentList() {
		return dao.selectStudents();
	}
	



	@Override
	public Student getStudent(int stdNo) {
		
		return dao.selectStudent(stdNo);
	}

	@Override
	public void createStudent(Student student) {
		
		dao.insertStudent(student);
	}

	@Override
	public void modifyStudent(Student student) {
		
		dao.updateStudent(student);
	}




	@Override
	public void removeStudent(Student student) {
		
		dao.updateStudent(student);
	}





}
