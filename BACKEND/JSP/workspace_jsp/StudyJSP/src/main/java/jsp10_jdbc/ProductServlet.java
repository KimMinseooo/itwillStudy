package jsp10_jdbc;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.pr")
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String command = req.getServletPath();
		System.out.println("command : " +command);
		
		if (command.equals("/ProductMain.pr")) {
			RequestDispatcher dis =
					req.getRequestDispatcher("jsp10_jdbc/product_main.jsp");
			
			dis.forward(req, resp);
		} else if (command.equals("/ProductRegistForm.pr")) {
			RequestDispatcher dis =
					req.getRequestDispatcher("jsp10_jdbc/product_regist_form.jsp");
			
			dis.forward(req, resp);
		} else if (command.equals("/ProductRegist.pr")) {
			int id= Integer.parseInt(req.getParameter("product_id"));
			String name = req.getParameter("product_name");
			int price = Integer.parseInt(req.getParameter("product_price"));
			int qty = Integer.parseInt(req.getParameter("product_qty"));
			String img = req.getParameter("product_img");
			
			ProductDTO dto = new ProductDTO(id, name, price, qty, img);
//			ProductDTO dto = new ProductDTO(id, name, price, qty);
			ProductDAO dao = new ProductDAO();
			
			int insertCnt = dao.insert(dto);
			System.out.println("INSERT 구문 실행 결과 : " +insertCnt);
			RequestDispatcher dis =
					req.getRequestDispatcher("jsp10_jdbc/product_regist_success.jsp");
			if(insertCnt==0) {
				dis =
						req.getRequestDispatcher("jsp10_jdbc/product_fail.jsp");
			}
			dis.forward(req, resp);
			
		} else if(command.equals("/ProductList.pr") ) {
			ProductDAO dao = new ProductDAO();
			List<ProductDTO> product = dao.selectAll();
			req.setAttribute("productList",product);
			
			RequestDispatcher dis =
					req.getRequestDispatcher("jsp10_jdbc/product_list.jsp");
			
			dis.forward(req, resp);
		} else if (command.equals("/product_detail.pr")) {
			int id = Integer.parseInt(req.getParameter("product_id"));
//			System.out.println("전달받은 id : " +id);
			
			ProductDAO dao = new ProductDAO();
			ProductDTO product  = dao.select(id);
			req.setAttribute("product",product);
			RequestDispatcher dis =
					req.getRequestDispatcher("jsp10_jdbc/product_detail.jsp");
			
			dis.forward(req, resp);
		} else if (command.equals("/ProductDelete.pr")) {
			System.out.println("삭제 호출 성공!");
			int id = Integer.parseInt(req.getParameter("product_id"));
			
			ProductDAO dao = new ProductDAO();
			int deleteCnt = dao.delete(id);	
			System.out.println("DELETE 구문 실행 결과 : " +deleteCnt);
			RequestDispatcher dis =
					req.getRequestDispatcher("jsp10_jdbc/product_main.jsp");
			if(deleteCnt==0) {
				dis =
						req.getRequestDispatcher("jsp10_jdbc/product_fail.jsp");
			}
			dis.forward(req, resp);
		}
	}
}
