package cogent.fullApp.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.fullApp.com.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
