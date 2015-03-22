package ie.cit;

import ie.cit.adf.dao.BookRepository;
import ie.cit.adf.domain.Book;

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
	}
}
