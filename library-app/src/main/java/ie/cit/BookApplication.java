package ie.cit;

import ie.cit.adf.dao.BookRepository;
import ie.cit.adf.dao.UserRepository;
import ie.cit.adf.domain.Book;
import ie.cit.adf.domain.Users;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");
		BookRepository bookRepository = ctx.getBean(BookRepository.class);

		Book book1 = new Book();
		book1.setBookGenre("Dystopian novel");
		book1.setBookAuthor("George Orwell");
		book1.setBookTitle("1984");
		book1.setBookPublisher("Secker and Warburg");
		bookRepository.addBook(book1);

		List<Book> all = bookRepository.getAll();
		System.out.println(all);

		ClassPathXmlApplicationContext ctxUsers = new ClassPathXmlApplicationContext(
				"beans.xml");
		UserRepository userRepository = ctxUsers.getBean(UserRepository.class);
		
		Users user1 = new Users();
		user1.setUserName("Ania Vin");
		user1.setUserAddress("White Street");
		user1.setUserCity("Cork");
		user1.setUserRegistrationDate("15 of January 2012");
		userRepository.addUser(user1);

		List<Users> allUsers = userRepository.getAllUsers();
		System.out.println(allUsers);
			
	}
}
