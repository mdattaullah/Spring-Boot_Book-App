package in.attaullah.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.attaullah.model.Book;
import in.attaullah.repo.BookRepo;



@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepo bookRepo;

	@Override
	public String upsert(Book book) {
		bookRepo.save(book);
		// TODO Auto-generated method stub
		return "Success";
	}

	@Override
	public Book getByID(Long id) {
		Optional<Book> findById = bookRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public String deleteById(Long id) {
		if(bookRepo.existsById(id)) {
			bookRepo.deleteById(id);
			return "Book Record Deleted Success";
		}
		else {
			return "No Book Record Found";
		}
	}

}
