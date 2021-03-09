package boardPkg.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import boardPkg.common.DBCon;
import boardPkg.model.Board;

public class BoardDAO {
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
   public Board[] selectBoards() {
      sql = "SELECT * FROM board ORDER BY board_no DESC";
      conn = DBCon.getConnection();
      Board[] boards = new Board[100];
      int i = 0;
      try {
         stmt = conn.createStatement(); // statement 인스턴스 만들고
         rs = stmt.executeQuery(sql); // resultset 에 값을 담음 (executeQuery) 로 실행
         while (rs.next()) {
            Board brd = new Board();
            brd.setBoardNo(rs.getInt("board_no"));
            brd.setTitle(rs.getString("title"));
            brd.setContent(rs.getString("content"));
            brd.setWriter(rs.getString("writer"));
            brd.setCreationdate(rs.getString("creation_date"));

            boards[i++] = brd;

         }
      } catch (SQLException e) {
         // e.printStackTrace();
         System.out.println("db오류");
      } finally {
         // 정상실행/예외발생 하던 무족건 실행해야 하는 내용 구현; rs/stmt 같은 접속을 이야기하는것
         close();
      }
      return boards;
   }

   // 한건 조회
   public Board selectBoard(int boardNo) {
      sql = "SELECT * FROM board WHERE board_no = " + boardNo;
      conn = DBCon.getConnection();
      Board brd = null;
      try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
         if (rs.next()) {
            brd = new Board(rs.getInt("board_no"), rs.getString("title"), rs.getString("content"),
                  rs.getString("writer"), rs.getString("creation_date"));

         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return brd;
   }

   // 입력 처리
   public void insertBoard(Board board) {
      conn = DBCon.getConnection();
      sql = "INSERT INTO board VALUES (" + board.getBoardNo() + ", '" + board.getTitle() + "', '" + board.getContent()
            + "', '" + board.getWriter() + "', " + " sysdate  " + ")";
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
   public void updateBoard(Board board) {
      conn = DBCon.getConnection();
      sql = "UPDATE board SET content =" + "'" + board.getContent() + "'" + " WHERE board_no = "
            + board.getBoardNo();
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

   // 삭제
   public void deleteBoard(Board board) {
      conn = DBCon.getConnection();
      sql = "DELETE FROM board WHERE board_no = " + board.getBoardNo();
      try {
         stmt = conn.createStatement();
         int r = stmt.executeUpdate(sql);
         System.out.println(r + "건 입력되었습니다.");
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }

   }
}