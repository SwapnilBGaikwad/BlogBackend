package com.thoughtworks.model;

import com.thoughtworks.model.Book.Book;

import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> bookList;

    public Library( List<Book> bookList ) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Book getBook( int id ) {
        List<Book> books = bookList.stream().filter( book -> book.getId() == id ).collect( Collectors.toList() );
        return books.get( 0 );
    }
}
