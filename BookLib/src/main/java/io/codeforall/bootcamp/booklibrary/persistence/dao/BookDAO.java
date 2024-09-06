package io.codeforall.bootcamp.booklibrary.persistence.dao;

import io.codeforall.bootcamp.booklibrary.model.Book;

import java.util.List;

public interface BookDAO {


    List<Book> getAllBooks();

    Book getById(int id);

    void saveOrUpdate(Book book);

    void delete(Book book);

}
