<%@page import="boardPkg.BoardDAO"%>
<%@page import="boardPkg.Board"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
   String bno = request.getParameter("boardNo");
   String til = request.getParameter("title");
   String cnt = request.getParameter("content");
   String wrt = request.getParameter("writer");
   
   int boardNo = Integer.parseInt(bno);
   
   Board board = new Board();
   BoardDAO dao = new BoardDAO();
   
   board.setBoardNo(boardNo);
   board.setTitle(til);S
   board.setContent(cnt);
   board.setWriter(wrt);
   
   Board retVal = new Board();
   dao.insertBoardResult(board);
   
   
   // {"name" : "Hong", "age":10} json file
   String result = "{\"boardNo\":\"" + retVal.getBoardNo() +"\","
         +"\"title\":\"" + retVal.getTitle() +"\","
         +"\"content\":\"" + retVal.getContent() + "\","
        +"\"creationDate\":\"" + retVal.getCreationDate() + "\","
         +"\"writer\":\"" + retVal.getWriter() + "\"}";
         out.print(result);
         //{"boardNo":"1", "title": "test", "content": "test", "writer": user1};
%>