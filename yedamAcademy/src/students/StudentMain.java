package students;

import java.util.Scanner;

import students.Student;
import students.Service;
import students.Servicelmpl;

public class StudentMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Service service = new Servicelmpl();
		boolean pass = false;
		Scanner scan = new Scanner(System.in);

		while (true) {
			if (!pass) {
				System.out.println("Id :");
				String id = scan.nextLine();
				System.out.println("PW :");
				String pw = scan.nextLine();
				if (id.equals("admin") && pw.equals("super")) {
					pass = true;
				} else {
					continue;
				}
			}
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생등록 2.학생정보수정 3.성적입력 4.성적조회 5.성적수정 6.전체리스트 9.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			menu = scn.nextInt();
			if (menu == 1) { // 입력처리
				System.out.print("학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextLine();
				System.out.print("이름 입력> ");
				String name = scn.nextLine();
				System.out.print("나이 입력> ");
				int age = scn.nextInt();
				scn.nextLine();
				System.out.print("연락처 입력> ");
				String phone = scn.nextLine();
				Student student = new Student(stdNo, name, age, phone, 0);
				service.createStudent(student);
			} else if (menu == 2) { // 수정처리
				System.out.print("학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextLine();

				System.out.print("수정하려는 연락처 입력> ");
				String phone = scn.nextLine();
				Student student = new Student(stdNo, null, 0, phone, 0);
				service.modifyStudent(student);

			} else if (menu == 3) { // 입력처리
				System.out.print("학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextInt();
				System.out.print("이름 입력> ");
				String name = scn.nextLine();
				scn.nextLine();
				System.out.print("점수 입력> ");
				int score = scn.nextInt();
				Student student = new Student(stdNo, name, 0, null, score);

			} else if (menu == 4) { // 성적조회
				System.out.print("조회할 학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextInt();
				Student student = service.getStudent(stdNo);
				System.out.println(student.toString());
			} else if (menu == 5) { // 성적수정
				System.out.print("학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextLine();

				System.out.print("수정하려는 점수 입력> ");
				int score = scn.nextInt();
				Student student = new Student(stdNo, null, 0, null, score);
				service.modifyStudent(student);
			} else if (menu == 6) { // 전체리스트
				Student[] list = service.getStudentList();
				for (Student bo : list) {
					if (bo != null)
						System.out.println(bo.toString());
				}
			} else if (menu == 9) { // 종료
				break;
			}
		}
	}

// end of while

}// end of main
// end of class
