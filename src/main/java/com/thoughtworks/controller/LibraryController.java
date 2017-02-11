package com.thoughtworks.controller;

import com.thoughtworks.model.Book.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/" )
public class LibraryController {

    @RequestMapping( method = RequestMethod.GET )
    public @ResponseBody Book getBooks( @ModelAttribute Book book ) {
        return book;
    }

}
