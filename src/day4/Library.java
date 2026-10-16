
package day4;

import java.util.List;

public class Library {
	List<Book> books;
	public void initializeBookList(List<Book> books) {
		this.books = books;
	}
	public void addBook(List<Book> books, Book book)
	throws DuplicateBookException
	{
		for(Book b : books)
		{
			if(b.getIsnb() == book.getIsnb())
			{
				throw new DuplicateBookException
				("Book with same isbn already exists");
			}
		}
		books.add(book);
	}

}

