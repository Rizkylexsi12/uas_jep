package com.exa.api.service.impl
import com.exa.api.entity.Book
import com.exa.api.repository.BookRepository
import com.exa.api.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookServiceImpl implements BookService {
    @Autowired
    private final BookRepository bookRepository

    @Override
    List<Book> findAll() {
        bookRepository.findAll()
    }

    @Override
    Book findById(int id) {
        bookRepository.findById(id)
    }

    @Override
    Book save(Book book) {
        bookRepository.save(book)
    }

    @Override
    Book update(Book book, int id) {
        def record = bookRepository.findById(id)
        record.with {
            name = book.name
            isbn = book.isbn
            category = book.category
        }
        bookRepository.save(record)
        record
    }

    @Override
    Book delete(int id) {
        def record = bookRepository.findById(id)
        bookRepository.delete(record)
        record
    }
}
