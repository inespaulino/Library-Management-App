package io.codeforall.bootcamp.booklibrary.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String author;

    private String isbn;

    private Date publishedDate;

    private double price;


    public Book(String title, String author, String isbn, Date published_date, double price) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedDate = published_date;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublished_date() {
        return publishedDate;
    }

    public void setPublished_date(Date published_date) {
        this.publishedDate = published_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", published_date=" + publishedDate +
                ", price=" + price +
                '}';
    }
}
