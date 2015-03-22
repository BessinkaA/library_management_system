package ie.cit.adf.dao;

import ie.cit.adf.domain.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JdbcBookRepository implements BookRepository {

	private JdbcTemplate jdbcTemplate;

	public JdbcBookRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void addBook(Book book) {
		jdbcTemplate
				.update("insert into books (book_id, book_genre, book_author, book_title, book_publisher, available) values (?,?,?,?,?,?)",
						book.getBookId(), book.getBookGenre(),
						book.getBookAuthor(), book.getBookTitle(),
						book.getBookPublisher(), book.isAvailable());

	}

	public List<Book> getAll() {
		return jdbcTemplate
				.query("select book_id, book_genre, book_author, book_title, book_publisher, available from books",
						new BookRowMapper());
	}

}

class BookRowMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		String book_id = rs.getString("book_id");
		String book_genre = rs.getString("book_genre");
		String book_author = rs.getString("book_author");
		String book_title = rs.getString("book_title");
		String book_publisher = rs.getString("book_publisher");
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
