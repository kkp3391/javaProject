package students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import students.DBCon;
import students.Student;

public class StudentDAO {
	Connection conn = null;
	Statement stmt = null; // 쿼리실행
	ResultSet rs = null; // 값 저장
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 전체 리스트 가저오기
	public Student[] selectStudents() {
		sql = "SELECT * FROM student ORDER BY std_id DESC";
		conn = DBCon.getConnection();
		Student[] students = new Student[100];
		int i = 0;
		try {
			stmt = conn.createStatement(); // statement 인스턴스 만들고
			rs = stmt.executeQuery(sql); // resultset 에 값을 담음 (executeQuery) 로 실행
			while (rs.next()) {
				Student std = new Student();
				std.setStdNo(rs.getInt("std_id"));
				std.setName(rs.getString("std_name"));
				std.setAge(rs.getInt("std_age"));
				std.setPhone(rs.getString("std_phone"));
				std.setScore(rs.getInt("std_score"));

				students[i++] = std;

			}
		} catch (SQLException e) {
			 e.printStackTrace();
			System.out.println("db오류");
		} finally {
			// 정상실행/예외발생 하던 무족건 실행해야 하는 내용 구현; rs/stmt 같은 접속을 이야기하는것
			close();
		}
		return students;
	}

	// 한건 조회
	public Student selectStudent(int stdNo) {
		sql = "SELECT * FROM student WHERE std_id = " + stdNo;
		conn = DBCon.getConnection();
		Student std = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				std = new Student(rs.getInt("stdNo"), rs.getString("name"), rs.getInt("age"), rs.getString("phone"),
						rs.getInt("score"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return std;
	}

	// 입력 처리
	public void insertStudent(Student student) {
		conn = DBCon.getConnection();
		sql = "INSERT INTO student VALUES (" + student.getstdNo() + ", '" + student.getName() + "', " + student.getAge()
				+ ", '" + student.getPhone() + "', " + student.getScore() + " )";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 수정
	public void updateStudent(Student student) {
		conn = DBCon.getConnection();
		sql = "UPDATE student SET std_phone =" + "'" + student.getPhone() + "'" + " WHERE std_id = "
				+ student.getstdNo();
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

}
