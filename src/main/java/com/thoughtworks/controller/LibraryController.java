package com.thoughtworks.controller;

import com.thoughtworks.model.Book.Book;
import com.thoughtworks.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/" )
public class LibraryController {

    private BookRepository bookRepository;

    @Autowired
    public LibraryController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping( method = RequestMethod.GET )
    public @ResponseBody Book getBooks( @ModelAttribute Book book ) {
        return bookRepository.findOne( book.getId() );
    }

    @RequestMapping( method = RequestMethod.POST )
    public @ResponseBody boolean saveBook( @ModelAttribute Book book ) {
        Book savedBook = bookRepository.save( book );
        System.out.println( savedBook );
        return savedBook != null;
    }

}
