package ie.cit.adf.dao;

import ie.cit.adf.domain.Book;

import java.util.List;

public interface BookRepository {

	void addBook(Book book);
	List<Book> getAll();
}
