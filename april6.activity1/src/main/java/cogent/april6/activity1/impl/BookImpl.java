package cogent.april6.activity1.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import cogent.april6.activity1.dao.rowmapper.BookMapper;

import cogent.april6.activity1.dao.BookDao;
import cogent.april6.activity1.dto.Book;


//@Component("bookDao")
public class BookImpl implements BookDao{
	
	@Autowired
	private JdbcTemplate template;
	
	
	@Override
	public int create(Book book) {
		String sql ="insert into books values(?,?,?,?)";
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		
		
		System.out.println("Enter book details:");
		System.out.println("id: ");
		book.setId(s.nextInt());
		System.out.println("name: ");
		book.setName(ss.nextLine());
		System.out.println("author: ");
		book.setAuthor(ss.nextLine());
		System.out.println("price: ");
		book.setPrice(s.nextDouble());
		
		//System.out.println();
		int result=template.update(sql,book.getId(),book.getName(),book.getAuthor(),book.getPrice());
		return result;
	}

	@Override
	public int update(Book book) {
		String sql ="update books"
				+ " set name=?, author=?, price=?"
				+ " where id=?";
		
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter book details:");
		System.out.println("id: ");
		book.setId(s.nextInt());
		System.out.println("name: ");
		book.setName(ss.nextLine());
		System.out.println("author: ");
		book.setAuthor(ss.nextLine());
		System.out.println("price: ");
		book.setPrice(s.nextDouble());
		
		int result=template.update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from books where id=?";
		int result = template.update(sql,id);
		return result;
	}

	@Override
	public Book read(int id) {
		
		String sql = "select * from books where id=?";
		Book emp = template.queryForObject(sql, new BookMapper(), id);
		return emp;
	}

	@Override
	public List<Book> readAll() {
		String sql = "select * from books";
		List <Book> bookList = new ArrayList<>();
		bookList = template.query(sql, new BookMapper());
		return bookList;
	}
	
}
