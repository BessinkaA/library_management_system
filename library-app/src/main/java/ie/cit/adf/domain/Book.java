package ie.cit.adf.domain;

import java.util.UUID;

public class Book {

	private String bookId;
	private String bookGenre;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private boolean available;

	public Book() {
		this.bookId = UUID.randomUUID().toString();
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return "Library [book id=" + bookId + ", book genre=" + bookGenre
				+ ", book title=" + bookTitle + ",book author=" + bookAuthor
				+ ",book publisher=" + bookPublisher + ", available=" + available + "]";
	}

}
