package org.cochise.service;

import org.cochise.dao.BookMapper;
import org.cochise.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    @Autowired
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    @Transactional
    public List<Books> getBooks() {
        return bookMapper.getBooks();
    }

    public void aaaa(){

    }
}
