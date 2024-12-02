package jsp10_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	public int insert(ProductDTO dto) {	
		System.out.println("전달받은 데이터 : " + dto);
		
		Connection con = null ;
		PreparedStatement pstmt = null;
		int insertCnt=0;
		try { 
			con = JdbcUtil.getConnection();
			
			String sql = "INSERT INTO PRODUCT VALUES(?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,	dto.getProduct_id());
			pstmt.setString(2,dto.getProduct_name());
			pstmt.setInt(3,	dto.getProduct_price());
			pstmt.setInt(4,	dto.getProduct_qty());
			pstmt.setString(5,dto.getProduct_img());
			
			System.out.println("pstmt = " + pstmt);
			insertCnt = pstmt.executeUpdate(); 
			
		}catch(SQLException e ) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		} {
			
		}
		return insertCnt;
	}
	
	public List<ProductDTO> selectAll() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		ProductDTO product = null;
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		try { 
			con = JdbcUtil.getConnection();
			String sql = "SELECT product_id,product_name,product_price,product_qty"
					+    " FROM PRODUCT";
			
			pstmt= con.prepareStatement(sql);
			System.out.println("pstmt : " + pstmt);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				product= new ProductDTO(rs.getInt("product_id"),rs.getString("product_name"),rs.getInt("product_price"),rs.getInt("product_qty"));
				list.add(product);
			}
		}catch (SQLException e ) {
			System.out.println("SQL 구문 오류");
		}finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		} 
		return list;
	}
	
	public ProductDTO select(int idx) {
		
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		ProductDTO product= null;


		try  {
			con = JdbcUtil.getConnection();
			
			// SELECT 구문
			String sql = "SELECT product_id, product_name, product_price, product_qty, product_img"
					+ "   FROM PRODUCT "
					+    "WHERE product_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			System.out.println("pstmt : " + pstmt);
			
			rs = pstmt.executeQuery();
			while(rs.next()) { // 데이터가 존재할 동안 반복~~~
				
				product = new ProductDTO(rs.getInt("product_id"),rs.getString("product_name"),rs.getInt("product_price"),rs.getInt("product_qty"),rs.getString("product_img"));
			}
			
		} catch(SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return product;
		
	}
	
	public int delete(int id) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int deleteCnt=0;
		try { 
			con = JdbcUtil.getConnection();
			
			String sql ="DELETE FROM PRODUCT WHERE product_id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			System.out.println("pstmt : "+ pstmt);
			
			deleteCnt = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		
		
		
		return deleteCnt;
	}
}
