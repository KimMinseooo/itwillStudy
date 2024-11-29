package jsp10_jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("*.jdbc")
public class JdbcServlet3 extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String command = req.getServletPath();
		System.out.println("command : " + command);
		
		
		if(command.equals("/Main.jdbc")) {
			RequestDispatcher dispatcher =
						req.getRequestDispatcher("jsp10_jdbc/jdbc_main.jsp");
			
			dispatcher.forward(req, resp);
		} else if (command.equals("/connect1.jdbc")) {
			
			// 1단계 . JDBC 드라이버 로드 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("드라이버 로드 성공!");
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 로드 실패!");
				e.printStackTrace();
			}
		} else if (command.equals("/connect2.jdbc")) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("드라이버 로드 성공!");
				
				String url = "jdbc:mysql://localhost:3306/STUDY_JSP";
				String user = "root";
				String passwd = "1234";
				
				Connection con =DriverManager.getConnection(url, user, passwd);
				System.out.println("DB 연결 성공! ");
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 로드 실패!");
				e.printStackTrace();
			} catch(SQLException e ) {
				System.out.println("DB 연결 실패!");
				e.printStackTrace();
			}
		} else if (command.equals("/connect3_insert.jdbc")) {
			
			int idx = Integer.parseInt(req.getParameter("idx"));
			String name =req.getParameter("name");
			
			StudentDTO dto = new StudentDTO(idx,name);
			StudentDAO dao = new StudentDAO();
			int insertCnt = dao.insert(dto);
			System.out.println("INSERT 구문 실행 결과 : " +insertCnt);
			
		} else if (command.equals("/connect3_update.jdbc")) {
				int no = Integer.parseInt(req.getParameter("no"));
				String name= req.getParameter("name");
				
				StudentDTO dto = new StudentDTO(no,name);
				StudentDAO dao = new StudentDAO();
			int updateCnt = dao.update(dto);
			System.out.println("UPDATE 구문 실행 결과 : "+updateCnt );
			
		} else if (command.equals("/connect3_delete.jdbc")) {
			int no = Integer.parseInt(req.getParameter("no"));

			StudentDTO dto= new StudentDTO(no);
			StudentDAO dao = new StudentDAO();
			int deleteCnt = dao.delete(dto);
			
			System.out.println("DELETE 구문 실행 결과 : " +deleteCnt);
			
		}
	}
}
