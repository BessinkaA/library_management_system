package ie.cit.adf.domain;

import java.util.UUID;

public class Book {

	private String book_id;
	private String book_genre;
	private String book_title;
	private String book_author;
	private String book_publisher;
	private boolean available;

	public Book() {
		this.book_id = UUID.randomUUID().toString();
	}

	public String getBookId() {
		return book_id;
	}

	public void setBookId(String book_id) {
		this.book_id = book_id;
	}

	public String getBookTitle() {
		return book_title;
	}

	public void setBookTitle(String book_title) {
		this.book_title = book_title;
	}

	public String getBookAuthor() {
		return book_author;
	}

	public void setBookAuthor(String book_author) {
		this.book_author = book_author;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getBookGenre() {
		return book_genre;
	}

	public void setBookGenre(String book_genre) {
		this.book_genre = book_genre;
	}

	public String getBookPublisher() {
		return book_publisher;
	}

	public void setBookPublisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	@Override
	public String toString() {
		return "Library [book id=" + book_id + ", book genre=" + book_genre
				+ ", book title=" + book_title + ",book author=" + book_author
				+ ",book publisher=" + book_publisher + ", available=" + available + "]";
	}

}
