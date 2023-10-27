package com.exa.api.controller
import com.exa.api.entity.Book
import com.exa.api.entity.Category
import com.exa.api.service.BookService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/books')
class BookController {
    @Autowired
    private final BookService bookService

    @GetMapping('')
    List<Category> findAll() {
        bookService.findAll()
    }

    @GetMapping('{id}')
    Book findById(@PathVariable('id') int id) {
        bookService.findById(id)
    }

    @PostMapping()
    Book save(@RequestBody Book book) {
        bookService.save(book)
    }

    @PutMapping('{id}')
    Book update(@RequestBody Book book, @PathVariable('id') int id) {
        bookService.update(book, id)
    }

    @DeleteMapping('{id}')
    Book delete(@PathVariable('id') int id) {
        bookService.delete(id)
    }
}
