package service;

import pojo.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

    public List<Book> selectBooksByMap(Map map);

}
