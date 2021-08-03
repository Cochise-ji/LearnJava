package org.cochise.dao;

import org.cochise.entity.Books;

import java.util.List;

public interface BookMapper {
    //查询所有书籍
    List<Books> getBooks();
}
