package com.sharma.repository;

import com.sharma.model.Book;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);
    Collection<Book> findAll();
}
