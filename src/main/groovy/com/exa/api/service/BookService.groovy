package com.exa.api.service
import com.exa.api.entity.Book

interface BookService {
    List<Book> findAll()
    Book findById(int id)
    Book save(Book book)
    Book update(Book book, int id)
    Book delete(int id)
}
