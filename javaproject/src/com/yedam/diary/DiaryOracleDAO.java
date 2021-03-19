package com.yedam.diary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//날짜, 내용
//테이블,
//접속계정:diary/diary


public class DiaryOracleDAO implements DAO{
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;
	int r = 0;

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

	@Override
	public int insert(DiaryVO vo) {
		conn = DBUtil.getConnection();
		sql = "insert into diary values('" + vo.getWdate() + "','" + vo.getContents() + "')";
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate(sql);
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("올바른 날짜가 아닙니다.");
		} finally {
			close();
		}
		return r;
	}

	@Override
	public void update(DiaryVO vo) {
		conn = DBUtil.getConnection();
		sql = "update diary set contents = '" + vo.getContents() + "' where wdate = TO_DATE(" + vo.getWdate() + ")";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	@Override
	public int delete(String date) {
		conn = DBUtil.getConnection();
		sql = "DELETE FROM diary WHERE wdate = TO_DATE(" + date + ")";
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate(sql);
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("없는 날짜입니다");
		} finally {
			close();
		}
		return r;
	}

	@Override
	public DiaryVO selectDate(String date) {
		conn = DBUtil.getConnection();
		sql = "SELECT * FROM diary WHERE wdate LIKE TO_DATE(" + date + ")";
		DiaryVO vo = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo = new DiaryVO(rs.getString("wdate"), rs.getString("contents"));
			}
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	@Override
	public DiaryVO selectContent(String content) {
		conn = DBUtil.getConnection();
		sql = "SELECT * FROM diary WHERE contents LIKE '%" + content + "%'";
		DiaryVO vo = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo = new DiaryVO(rs.getString("wdate"), rs.getString("contents"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	@Override
	public List<DiaryVO> selectAll() {
		conn = DBUtil.getConnection();
		sql = "select * FROM diary order by wdate desc";
		List<DiaryVO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO vo = new DiaryVO(rs.getString("wdate"), rs.getString("contents"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
}
