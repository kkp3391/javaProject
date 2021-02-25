package references;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("____________________________________________");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("____________________________________________");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수: ");
				int x = scanner.nextInt();
				int studentnum = x;
				scores = new int[studentnum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("score[" + i + "] : ");
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + " : " + scores[i]);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					avg = (double) sum / studentNum;
				}
				System.out.println("총합: " + sum);
				System.out.println("평균: " + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램종료");

	}

}
