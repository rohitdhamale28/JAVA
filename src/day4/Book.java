package day4;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable, Serializable {
	private int isnb;
	private String title;
	private String author;

	public Book(int isnb, String title, String author) {
		super();
		this.isnb = isnb;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isnb=" + isnb + ", title=" + title + ", author=" + author + "]";
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}

	@Override
	public void serialize() {
		// TODO Auto-generated method stub
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Printable.super.test();
	}

	public int getIsnb() {
		return isnb;
	}

	public void setIsnb(int isnb) {
		this.isnb = isnb;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static void main(String[] args) {
		Library lib = new Library();
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(323, "abc", "aaa"));
		books.add(new Book(123, "xyz", "bbb"));
		books.add(new Book(323, "pqr", "ccc"));
		
		lib.initializeBookList(books);
		try {
			lib.addBook(books, new Book(323, "xyz", "bbb"));
		}
		catch (DuplicateBookException e) {
			System.out.println(e.getMessage() + "Try with different ISBN");
		}
		System.out.println(books);
	}
}
