package cogent.april6.activity1.dao;

import java.util.List;

import cogent.april6.activity1.dto.Book;


public interface BookDao {
	int create(Book book);
	int update(Book book);
	int delete(int id);
	Book read(int id);
	List<Book> readAll();
}
