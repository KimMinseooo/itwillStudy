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
	
}
