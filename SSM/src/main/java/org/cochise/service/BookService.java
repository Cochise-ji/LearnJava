package org.cochise.service;

import org.cochise.entity.Books;

import java.util.List;

public interface BookService {

    //查询所有书籍
    List<Books> getBooks();
}
