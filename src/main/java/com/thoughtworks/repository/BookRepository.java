package com.thoughtworks.repository;

import com.thoughtworks.model.Book.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
    @Override Book save( Book book );

    @Override Book findOne( String id );
}
