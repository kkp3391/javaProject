package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmpDAO {
	Connection conn = null;
	EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}
	
	public Department[] deptList() {
		String sql = "select* from departments";
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Department[] department = new Department[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while(rs.next())  {
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_id"));
				dept.setManagerId(rs.getString("manager_Id"));
				dept.setLocationId(rs.getString("location_Id"));
				//				System.out.println(emp.toString());
				department[i++] = dept;
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("호출완료");
		return department;
	
	}
	
	
	public Employee[] empList() {
		String sql = "select*from emp_java";
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while(rs.next())  {
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getNString("hire_date"));
				emp.setJobId(rs.getNString("job_id"));
				emp.setLastName(rs.getNString("last_name"));
				emp.setPhoneNumber(rs.getNString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
				//				System.out.println(emp.toString());
				employees[i++] = emp;
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		
		System.out.println("호출완료");
		return employees;
	}

	public List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}
}
