package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;
import service.MemberService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	Member map(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		return new Member.Builder().setUserId(userId).setPassword(password).build();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("04_loginForm.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		MemberService service = MemberService.getInstance();

		Member member = map(request);
		Member m = service.checkLogin(member);

		if (m != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", m);
			response.sendRedirect("04_main.jsp");
		} else {
			request.setAttribute("error", "Sorry,<br>User ID or Password is incorrect.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("04_loginForm.jsp");
			dispatcher.forward(request, response);
		}
	}
	private static final long serialVersionUID = 1L;
}