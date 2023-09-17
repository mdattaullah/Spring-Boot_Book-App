package in.attaullah.service;

import java.util.List;

import in.attaullah.model.Book;

public interface BookService {
	
	public String upsert(Book book);
	
	public Book getByID(Long  id);
	
	public List<Book> getAllBooks();
	
	public String deleteById(Long id);
	

}
