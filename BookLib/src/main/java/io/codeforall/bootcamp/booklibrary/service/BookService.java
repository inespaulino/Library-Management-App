package io.codeforall.bootcamp.booklibrary.service;


import io.codeforall.bootcamp.booklibrary.model.Book;
import io.codeforall.bootcamp.booklibrary.persistence.jpa.BookJpaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookJpaDAO bookDAO;

    @Transactional
    public List<Book> getAllBooks(){
        return bookDAO.findAll();
    }

    @Transactional
    public Book getById(Integer id) {
        return bookDAO.findById(id);
    }

    @Transactional
    public Book saveOrUpdate(Book book) {
        return bookDAO.saveOrUpdate(book);
    }

    @Transactional
    public void delete(Integer id) {
        bookDAO.delete(id);

    }
}
