package com.thoughtworks.controller;

import com.thoughtworks.model.Book.Book;
import com.thoughtworks.model.Library;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class LibraryController {

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public @ResponseBody Book getBooks( @ModelAttribute Book book ) {
        Book book1 = new Book( 1, "Book 1" );
        Book book2 = new Book( 2, "Book 2" );
        List<Book> books = Arrays.asList( book1, book2 );
        Library library = new Library( books );

        return library.getBook( book.getId() );
    }
}
