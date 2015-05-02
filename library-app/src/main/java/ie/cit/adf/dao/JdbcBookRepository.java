package ie.cit.adf.dao;

import ie.cit.adf.domain.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcBookRepository implements BookRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcBookRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void addBook(Book book) {
		jdbcTemplate
				.update("insert into books (bookId, bookGenre, bookAuthor, bookTitle, bookPublisher, available) values (?,?,?,?,?,?)",
						book.getBookId(), book.getBookGenre(),
						book.getBookAuthor(), book.getBookTitle(),
						book.getBookPublisher(), book.isAvailable());

	}

	public List<Book> getAll() {
		return jdbcTemplate
				.query("select bookId, bookGenre, bookAuthor, bookTitle, bookPublisher, available from books",
						new BookRowMapper());
	}

}

class BookRowMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		String book_id = rs.getString("bookId");
		String book_genre = rs.getString("bookGenre");
		String book_author = rs.getString("bookAuthor");
		String book_title = rs.getString("bookTitle");
		String book_publisher = rs.getString("bookPublisher");
		boolean available = rs.getBoolean("available");

		Book book = new Book();
		book.setBookId(book_id);
		book.setBookGenre(book_genre);
		book.setBookAuthor(book_author);
		book.setBookTitle(book_title);
		book.setBookPublisher(book_publisher);
		book.setAvailable(available);
		return book;
	}

}
