package cogent.april6.activity1.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cogent.april6.activity1.dto.Book;

public final class BookMapper implements RowMapper<Book> {
    @Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
      Book book = new Book();
      book.setId(rs.getInt("id"));
      book.setName(rs.getString("name"));
      book.setAuthor(rs.getString("author"));
      book.setPrice(rs.getDouble("price"));
      return book;
    }

	
  }