package jsp10_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {

	public int insert(ProductDTO prod) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int insertCnt = 0;
		try { 
			con = JdbcUtil.getConnection();
			
			String sql = "INSERT INTO PRODUCT VALUES (?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, prod.getProduct_id());
			pstmt.setString(2, prod.getProduct_name());
			pstmt.setInt(3, prod.getProduct_price());
			pstmt.setInt(4, prod.getProduct_qty());
			pstmt.setString(5, prod.getProduct_img());
			insertCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		return insertCnt;
	}

	public ArrayList<ProductDTO> selectAll(ProductDTO product) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>(); 
		
		try {
			con = JdbcUtil.getConnection();
			String sql = "select * from product ";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductDTO prod = new ProductDTO();
				prod.setProduct_id(rs.getInt("product_id"));
				prod.setProduct_name(rs.getString("product_name"));
				prod.setProduct_price(rs.getInt("product_price"));
				prod.setProduct_qty(rs.getInt("product_qty"));
				list.add(prod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return list;
	}

	public ProductDTO select(int product_id) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProductDTO prod =null;
		try {
			con = JdbcUtil.getConnection();
			
			String sql = "SELECT * FROM PRODUCT WHERE product_id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				prod = new ProductDTO();
				prod.setProduct_id(rs.getInt("product_id"));
				prod.setProduct_name(rs.getString("product_name"));
				prod.setProduct_price(rs.getInt("product_price"));
				prod.setProduct_qty(rs.getInt("product_qty"));
				prod.setProduct_img(rs.getString("product_img"));
			}
			System.out.println(prod);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return prod;
	}

	public int delete(int product_id) {
		
		int deleteCnt=0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = JdbcUtil.getConnection();
			String sql = "DELETE FROM PRODUCT WHERE product_id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_id);
			deleteCnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		return deleteCnt;
	} 
	
}