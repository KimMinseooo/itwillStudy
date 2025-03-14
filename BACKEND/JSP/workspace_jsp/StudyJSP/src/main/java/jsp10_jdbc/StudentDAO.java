package jsp10_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public void select(int idx) {
		
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		
		try { 
			con = JdbcUtil.getConnection();
			
			// SELECT 구문
			String sql = "SELECT NAME , IDX FROM STUDENT WHERE idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			System.out.println("pstmt : " + pstmt);
			// ----------------------------------------
			// SELECT 구문은 다른 작업들과 완전 달라짐

			rs = pstmt.executeQuery();
			// 조회 성공/실패 여부와 관계없이 ResultSet 객체는 생성됨(null 없음)
			System.out.println(rs);
			
			/*
			 * SELECT 구문 실행 성공 시 조회된 테이블이 ResultSet 객체에 저장되므로
			 * ResultSet 객체의 next() 메서드 호출하여 커서를 다음 레코드(row)로 이동시킴
			 * => 이때, next() 메서드 리턴타입이 boolean 이므로 판별을 통해
			 * 다음 레코드(row) 존재 여부 확인 가능!
			 * 
			 * +-----+-------+
			 * | idx | name  | <-- 현재 커서 위치(항상 맨 처음 커서 위치는 첫번째 레코드보다 위)
			 * +-----+-------+
			 * |1 	 | 홍길동	 | <-- rs.next() 한 번 호출 시 커서 위치   (true 리턴)
			 * |2	 | 이순신	 | <-- rs.next() 두 번 호출 시 커서 위치   (true 리턴)
			 * |3	 | 강감찬	 | <-- rs.next() 세 번 호출 시 커서 위치   (true 리턴)
			 * +-----+-------+ <-- rs.next() 네 번 호출 시 커서 위치   (false 리턴)
			 * 
			 * */
			
//			System.out.println("첫번째 row가 존재하는가? " +rs.next());
//			System.out.println("컬럼 인덱스로 첫번쨰 row의 첫번째 컬럼에 접근 : " +rs.getInt(1));
//			System.out.println("컬럼 인덱스로 첫번쨰 row의 두번째 컬럼에 접근 : " +rs.getString(2));
//
//			System.out.println("두번째 row가 존재하는가? " +rs.next());
//			System.out.println("컬럼 인덱스로 첫번쨰 row의 첫번째 컬럼에 접근 : " +rs.getInt(1));
//			System.out.println("컬럼 인덱스로 첫번쨰 row의 두번째 컬럼에 접근 : " +rs.getString(2));

//			if (rs.next()) { // 데이터 있음
//		 		System.out.println("데이터 있음!");
//		 		System.out.println("idx 컬럼 데이터 : "+rs.getInt("IDX"));
//		 		System.out.println("name 컬럼 데이터 : "+rs.getString("NAME"));
//		 	} else { // 데이터 없음
//		 		System.out.println("데이터 없음!");
//		 	}
			
			// 조회 결과가 다중 row(복수개)일 수도 있는 경우 : while문 활용
			// => if문 대신 while문을 사용하여 ["다음 row가 존재할 동안" 반복]
			while(rs.next()) {
				// 데이터가 존재할 동안 반복~~~
				System.out.println("idx 컬럼 데이터 : "+rs.getInt("IDX"));
		 		System.out.println("name 컬럼 데이터 : "+rs.getString("NAME"));
			}
			
		} catch(SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		
	}

	public StudentDTO select2(int idx) {
		// DB 작업에 필요한 객체들 로컬 변수 선언
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		StudentDTO student= null;


		try  {
			con = JdbcUtil.getConnection();
			
			// SELECT 구문
			String sql = "SELECT NAME , IDX FROM STUDENT WHERE idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			System.out.println("pstmt : " + pstmt);
			
			rs = pstmt.executeQuery();
			while(rs.next()) { // 데이터가 존재할 동안 반복~~~
				
				student = new StudentDTO(rs.getInt("idx"),rs.getString("name"));
			}
			
		} catch(SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return student;
	}
	public List<StudentDTO> select3() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentDTO student = null;
		List<StudentDTO> list = new ArrayList<StudentDTO>();

		con = JdbcUtil.getConnection();
		try { 
			
			String sql = "SELECT NAME , IDX FROM STUDENT";
			pstmt = con.prepareStatement(sql);
			System.out.println("pstmt : " + pstmt);
			
			rs = pstmt.executeQuery();
			while(rs.next()) { // 데이터가 존재할 동안 반복~~~
				
				student = new StudentDTO(rs.getInt("idx"),rs.getString("name"));
				list.add(student);
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return list;
	}
		
		
}
