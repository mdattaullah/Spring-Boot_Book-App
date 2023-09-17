package in.attaullah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.attaullah.model.Book;
import in.attaullah.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	
	@PostMapping("/book")
	public ResponseEntity<String> CreateBook(@RequestBody Book book){
		String status = bookService.upsert(book);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook (@PathVariable Long  id){
		Book book = bookService.getByID(id);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List <Book> allBooks = bookService.getAllBooks();
		return new  ResponseEntity<>(allBooks,HttpStatus.OK);
		
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String status = bookService.upsert(book);
		return new ResponseEntity<>(status, HttpStatus.OK);
		
	} 
	@DeleteMapping("/book/{id}")
	public ResponseEntity<String> deleteBook (@PathVariable Long  id){
		String ststus = bookService.deleteById(id);
		return new ResponseEntity<>(ststus, HttpStatus.OK);
	}
	

}
