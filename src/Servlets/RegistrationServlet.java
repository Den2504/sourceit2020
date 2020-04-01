package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iteagles.kuzmin.diplom.dao.impl.DefaultUserDao;

import models.UserData;
import java.sql.Date;

@WebServlet(urlPatterns = { "/Registration" })
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DefaultUserDao userDao;
	
	{
		userDao = DefaultUserDao.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/userRegistration.jsp").forward(request, response);
		UserData user = new UserData();
		user.setLastName(request.getParameter("last_name"));
		user.setFirstName(request.getParameter("first_name"));
		user.setBirthday(Date.valueOf(request.getParameter("birthday")));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setPassword(request.getParameter("password"));
		userDao = DefaultUserDao.getInstance();
		userDao.saveUser(user);
		response.sendRedirect(getServletContext().getContextPath() + "/myAccount.jsp");
	}	
		public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println("Hello user! Your Email = " + email + " " + " and your password = " + password);
	}

}