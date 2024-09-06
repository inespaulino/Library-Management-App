package io.codeforall.bootcamp.booklibrary;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookDto {

    private Integer id;


    @NotNull(message = "Title is mandatory")
    @NotBlank(message = "Title is mandatory")
    @Size(min = 3, max = 100)
    private String title;


    @NotNull(message = "Author is mandatory")
    @NotBlank(message = "Author is mandatory")
    @Size(min = 3, max = 64)
    private String author;


    @NotNull(message = "ISBN is mandatory")
    @NotBlank(message = "ISBN is mandatory")
    @Size(min = 13, max= 13)
    private String isbn;

    private String publishedDate;

    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
