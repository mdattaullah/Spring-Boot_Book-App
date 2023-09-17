package in.attaullah.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.attaullah.model.Book;

public interface BookRepo extends JpaRepository<Book, Serializable>{

}
