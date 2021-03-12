package znznnznnn;

import java.util.Scanner;



public class StudentApp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생등록 2.학생정보수정 3.학생정보삭제 4.리스트 9.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			menu = scn.nextInt();
			if (menu == 1) { // 입력처리
				System.out.print("학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextLine();
				System.out.print("이름 입력> ");
				String name = scn.nextLine();
				scn.nextLine();
				System.out.print("점수 입력> ");
				int score = scn.nextInt();
				Student student = new Student(stdNo, name, score);
			} else if (menu == 2) { // 수정처리
				System.out.print("학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextLine();
				System.out.print("수정하려는 점수 입력> ");
				int score = scn.nextInt();
				Student student = new Student(stdNo, null, score);
				
			} else if (menu == 3) { // 입력처리
				System.out.print("삭제할 학번 입력> ");
				int stdNo = scn.nextInt();
				scn.nextInt();
				Student student = new Student(stdNo, null, 0);
			} else if (menu == 4) { // 성적조회
				
			} else if (menu == 5) { // 성적수정
				Student[] list = Student.getStudentList();
				for (Student bo : list) {
					if (bo != null)
						System.out.println(bo.toString());
				
				break;
			}
		}
	}

}
