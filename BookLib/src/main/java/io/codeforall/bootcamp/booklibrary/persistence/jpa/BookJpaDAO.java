package io.codeforall.bootcamp.booklibrary.persistence.jpa;


import io.codeforall.bootcamp.booklibrary.model.Book;
import io.codeforall.bootcamp.booklibrary.persistence.dao.BookDAO;
import org.springframework.stereotype.Repository;

@Repository
public class BookJpaDAO extends GenericJpaDAO<Book> {

    public BookJpaDAO() {
        super(Book.class);
    }

}
