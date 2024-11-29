package jsp10_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

	// insert 
//	public int insert(int idx, String name) {
	public int insert(StudentDTO dto) {	
		System.out.println("전달받은 데이터 : " + dto);
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int insertCnt =0;
		try { 
			con = JdbcUtil.getConnection();
			
			String sql = "INSERT INTO STUDENT VALUES(?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getIdx());
			pstmt.setString(2, dto.getName());
			System.out.println("pstmt = " + pstmt);
			insertCnt = pstmt.executeUpdate();
		} catch(SQLException e ) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		
		return insertCnt;
	}
	
	public int update(StudentDTO dto) { 
		System.out.println("전달받은 데이터 : "+dto);
		
		Connection con = null;
		PreparedStatement pstmt= null;
		int updateCnt = 0;
		try {
			
			con = JdbcUtil.getConnection();
			
			String sql = "UPDATE STUDENT SET NAME = ? WHERE IDX = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getIdx());
			
			updateCnt = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		
		
		return updateCnt;
		
	}
	
	public int delete(StudentDTO dto ) {
		System.out.println("전달받은 데이터 : "+dto);
		
		Connection con = null;
		PreparedStatement pstmt= null;
		int deleteCnt = 0;
		
		try {
			con = JdbcUtil.getConnection();
			String sql = "DELETE FROM STUDENT WHERE IDX = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getIdx());
			deleteCnt = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		
		
		return deleteCnt;
	}
	
}
