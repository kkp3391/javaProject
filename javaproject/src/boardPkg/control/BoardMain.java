package boardPkg.control;

import java.util.Scanner;

import boardPkg.model.Board;
import boardPkg.model.Service;
import boardPkg.model.impl.ServiceImpl;
//import boardPkg.model.impl.ServiceImpl2;

//실행되는 class
public class BoardMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Service service = new ServiceImpl();
//      Service service = new ServiceImpl2();
//      service.getBoard(15);
//      service.getBoardList();

		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.리스트 9.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			menu = scn.nextInt();
			if (menu == 1) { // 입력처리
				System.out.print("게시글번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("게시글제목 입력> ");
				String title = scn.nextLine();
				System.out.print("게시글내용 입력> ");
				String content = scn.nextLine();
				System.out.print("게시글작성자 입력> ");
				String writer = scn.nextLine();
				Board board = new Board(boardNo, title, content, writer, null);
				service.createBoard(board);
			} else if (menu == 2) { // 수정처리
				System.out.print("수정하려는 게시글번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("수정하려는 게시글내용 입력> ");
				String content = scn.nextLine();
				Board board = new Board(boardNo, null, content, null, null);
				service.modifyBoard(board);

			} else if (menu == 3) { // 삭제처리
				System.out.print("삭제할 게시글번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextInt();
				Board board = new Board(boardNo, null, null, null, null);
				service.removeBoard(board);
			} else if (menu == 4) { // 조회
				System.out.print("조회할 게시글번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextInt();
				Board board = service.getBoard(boardNo);
				System.out.println(board.toString());
			} else if (menu == 5) { // 리스트
				Board[] list = service.getBoardList();
				for (Board bo : list) {
					if (bo != null)
						System.out.println(bo.toString());
				}
			
			} else if (menu == 9) { // 종료
				break;
			}

			/*
			 * Board[] list = Service.getBoardList(); for(Board bo : list) { if(bo !=null)
			 * System.out.println(bo.toString());
			 */	
		} // end of while
		System.out.println("프로그램 종료");
	}// end of main
}// end of class











String id;
String pw;
String trueID = "admin";
String truePW = "super";
do
{
	System.out.print("ID : ");
	id = scan.next();
	System.out.print("PW : ");
	pw = scan.next();
	if(!id.equals(trueID)) System.out.println("아이디가 없습니다.");
	else {
		if(!pw.equals(truePW)) System.out.println("잘못된 비밀번호입니다.");
		else {
			System.out.println("로그인 되었습니다.");
			break;
		}
	}
}


