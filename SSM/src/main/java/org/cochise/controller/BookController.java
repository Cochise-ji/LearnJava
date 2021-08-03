package org.cochise.controller;

import org.cochise.entity.Books;
import org.cochise.service.BookService;
import org.cochise.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String getAllBooks(Model model){
        List<Books> books = bookService.getBooks();
        model.addAttribute("list", books);
        return "allBook";


    }
}
