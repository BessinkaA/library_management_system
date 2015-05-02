package ie.cit.adf.web;

import ie.cit.adf.dao.BookRepository;
import ie.cit.adf.dao.UserRepository;
import ie.cit.adf.domain.Book;
import ie.cit.adf.domain.Users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class LibraryServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BookRepository bookRepository;
	private UserRepository userRepository;

	@Override
	public void init() throws ServletException {
		ServletContext servletContext = getServletContext();
		WebApplicationContext ctx = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		bookRepository = ctx.getBean(BookRepository.class);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		String msg = String
				.format("Current time is: %s", new Date().toString());
		writer.println(msg);
		writer.close();

		List<Book> all = bookRepository.getAll();
		System.out.println(all);

	}

	protected void doGetUsers(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		String msg = String
				.format("Current time is: %s", new Date().toString());
		writer.println(msg);
		writer.close();

		List<Users> allUsers = userRepository.getAllUsers();
		System.out.println(allUsers);
	}
}
