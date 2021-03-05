package hr;

public class MainExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Employee[] empList = dao.empList();
		
		System.out.println("salary가 5000 이상인 사람 정보>>");
		for (Employee emp : empList) {

			if (emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}
		dao = new EmpDAO();
		Department[] deptList = dao.deptList();
		for (Department dept : deptList) {
			if (dept != null) {
			System.out.println(dept.toString());
		}
		}
		
	}

}
