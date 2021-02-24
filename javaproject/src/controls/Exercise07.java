package controls;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("____________");
			System.out.println("1예금 2.출금 3.잔고 4.종료");
			System.out.println("____________");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("입금액을 입력>>");
			}else if(menu == 2) {
			
		}else if(menu == 3) {
			System.out.println("잔액은" + balance);
		}else if(menu == 4) {
			run = false;
		}

	}
System.out.println("프로그램 종료");
}
}