package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ImageService;

/**
 * Servlet implementation class GalleryServlet
 */
@WebServlet("/gallery")
public class GalleryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GalleryServlet() {
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

		ImageService service = ImageService.getInstance();

		ServletContext application = getServletContext();
		String path = application.getRealPath("/images");

		String[] files = service.getImageList(path);

		request.setAttribute("list", files);
		RequestDispatcher dispatcher = request.getRequestDispatcher("gallery.jsp");
		dispatcher.forward(request, response);
		// System.out.println(files);
		// for(String img : files) {
		// System.out.println(img);
		// }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
