package pojo;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer book_id;
    private String book_name;
    private String book_describe;
    private String book_author;

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_describe='" + book_describe + '\'' +
                ", book_author='" + book_author + '\'' +
                '}';
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_describe() {
        return book_describe;
    }

    public void setBook_describe(String book_describe) {
        this.book_describe = book_describe;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }
}
