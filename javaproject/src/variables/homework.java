package variables;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int classcount = 3;
		int count = 2;
		int studentNum = 0;
		int student = 0;
		int max = 0;
		int maxstudent = 0;
		int engscore = 0;
		int maxstudents = 0;
		int mathscore = 0;
		while (true) {
			System.out.println("_____________________________________________________________________________________");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.조회 | 5.영어최고점 | 6.합계최고 | 7.수학평균점이상 | 9.종료");
			System.out.println("______________________________________________________________________________________");
			System.out.print("선택> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				if (studentNum != 0) {
					System.out.println("이미 입력 했습니다.");
				} else {
					System.out.print("학생수 > ");
					studentNum = scn.nextInt();
					students = new int[studentNum][classcount];
				}
			} else if (menu == 2) {
				if (students[0][1] != 0) {
					System.out.println("이미 입력 했습니다.");
				} else {
					for (int i = 0; i < students.length; i++) {
						System.out.print("학생번호>>");
						student = scn.nextInt();
						students[i][0] = student;
						System.out.print("영어점수>");
						engscore = scn.nextInt();
						students[i][1] = engscore;
						System.out.print("수학점수>");
						mathscore = scn.nextInt();
						students[i][2] = mathscore;
					}
				}
			} else if (menu == 3) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("학생정보 - 번호:" + students[i][0] + ", " + "영어:" + students[i][1] + ", " + "수학:"
							+ students[i][2]);
				}

			} else if (menu == 4) {
				System.out.print("찾고자 하는 학생정보 입력 > ");
				student = scn.nextInt();
				for (int i = 0; i < students.length; i++) {
					if (student == students[i][0]) {
						System.out.println("학생정보 - 번호:" + students[i][0] + ", " + "영어:" + students[i][1] + ", " + "수학:"
								+ students[i][2]);
					}
				}
			} else if (menu == 5) {
				for (int i = 0; i < students.length; i++) {
					if (max < students[i][1]) {
						max = students[i][1];
						maxstudent = students[i][0];
					}
				}
				System.out.println("영어최고점 : 학생번호 - " + maxstudent + "/ 영어 : " + max);

			} else if (menu == 6) {
				double avg = 0.0;
				double sum = 0;
				double maxsum = 0;
				for (int i = 0; i < students.length; i++) { 
					for (int j = 1; j < students[i].length; j++) { 
						sum += students[i][j];
						if (maxsum < sum) {
							maxsum = sum;
							avg = sum / 2;
							maxstudent = students[i][0];
						}
					}
					sum = 0;
				}
				System.out.println("학생번호 : " + maxstudent + " 평균점수 : " + avg);
			} else if (menu == 7) {
				double mathsum = 0.0;
				for (int i = 0; i < students.length; i++) {
					mathsum += students[i][2];
				}
				System.out.println("평균점수 : " + mathsum / students.length);
				for (int i = 0; i < students.length; i++) {
					if (mathsum / students.length < students[i][2]) {
						System.out.println("학생번호 : " + students[i][0] + ", " + "수학점수 : " + students[i][2]);
					}
				}
			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}