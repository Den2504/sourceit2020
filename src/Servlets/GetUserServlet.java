package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.iteagles.kuzmin.diplom.dao.UserDao;
import com.iteagles.kuzmin.diplom.dao.impl.DefaultUserDao;

import models.UserData;

@WebServlet(urlPatterns = { "/GetUserController" })
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

	{
		userDao = DefaultUserDao.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserData user = userDao.getUserById(Integer.valueOf(request.getParameter("id")));
		System.out.println(user);
		

	request.setAttribute("User", user);
	request.getRequestDispatcher("WEB-INF/views/user.jsp")
			.forward(request, response);

	}
}
