package object2;

import java.util.Scanner;

public class LibrarayApplication {

	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		
		while(true) {
			System.out.println("_____________________________________________________________");
			System.out.println("1)도서정보등록  2)회원정보등록  3)도서대여  4)도서반납  5)도서목록  9)종료");
			System.out.println("______________________________________________________________");
			System.out.print("선택>");
			
			int menu = scn.nextInt();
			//제목,저자,출판사,가격
			String info  = scn.nextLine();
			if (menu == 1) {
				for(int i = 0; i <bookList.length; i++) {
					System.out.println("제목");
					bookList[i].setBookTitle(scn.nextLine());
					System.out.println("저자");
					bookList[i].setBookAuthor(scn.nextLine());
					System.out.println("출판사");
					bookList[i].setBookPress(scn.nextLine());
					System.out.println("가격");
					bookList[i].setBookPrice(scn.nextInt());
					
				} else if(menu == 2) {
						
					} else if(menu ==3) {
						
					} else if(menu ==4 ) {
						
					} else if(menu == 5) {
						
					} else if(menu == 9) {
						
					}
				
					
				
		
		
				}
		}
	}
}
