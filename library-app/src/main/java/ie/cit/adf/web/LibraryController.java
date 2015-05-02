package ie.cit.adf.web;

import ie.cit.adf.dao.BookRepository;
import ie.cit.adf.dao.UserRepository;
import ie.cit.adf.domain.Book;
import ie.cit.adf.domain.Users;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {

	@Autowired
	private BookRepository repo;
	@Autowired
	private UserRepository userRepo;

	@RequestMapping("all")
	public ModelAndView getAllBooks() {
		List<Book> allBooks = repo.getAll();
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("books", allBooks);
		return new ModelAndView("books", model);
	}

	@RequestMapping("allusers")
	public ModelAndView getAllLibraryUsers() {
		List<Users> allUsers = userRepo.getAllUsers();
		HashMap<String, Object> modelUsers = new HashMap<String, Object>();
		modelUsers.put("users", allUsers);
		return new ModelAndView("users", modelUsers);
	}

	/**
	 * @RequestMapping("all") public String getAllBooks(Model model) {
	 *                        model.addAttribute("books", repo.getAll()); return
	 *                        "book"; }
	 */

}
