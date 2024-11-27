package jsp09_servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


// *.st 서블릿 주소 매핑 
@WebServlet("*.st")
public class StudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("StudentServlet - doProcess()");
		
		String cmd = request.getServletPath(); // 프로젝트명/~~~~~~      /~~~~뽑아오기
		System.out.println(cmd);
		
		if(cmd.equals("/StudentMain.st")) { // 학생 메인 화면 
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp09_servlet/test6_student_main.jsp");
			dispatcher.forward(request, response);
		}
		
		else if(cmd.equals("/StudentRegistForm.st")) { // 학생 정보 등록 화면
//			HttpSession session = request.getSession();
//			session.setAttribute("idx", idx);
//			session.setAttribute("name", name);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp09_servlet/test6_student_regist_form.jsp");
			dispatcher.forward(request, response);
			
		} else if(cmd.equals("/StudentList.st")) {  // 학생 목록 조회 화면
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp09_servlet/test6_student_list.jsp");
			dispatcher.forward(request, response);
		} else if(cmd.equals("/StudentRegist.st")) { // 학생 정보 등록성공 화면
			
			String idx = request.getParameter("idx");
			String name= request.getParameter("name");
			
			System.out.println("전달받은 idx : " + idx);
			System.out.println("전달받은 name : "+name);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp09_servlet/test6_student_regist_success.jsp");
			dispatcher.forward(request, response);
		}
	}
}
