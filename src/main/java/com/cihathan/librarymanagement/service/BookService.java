package com.cihathan.librarymanagement.service;

import com.cihathan.librarymanagement.models.Books;
import com.cihathan.librarymanagement.models.dtos.BooksDTO;
import com.cihathan.librarymanagement.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service //@Component
public class BookService {
    private final BookRepository bookRepository;


    public BooksDTO saveBook(BooksDTO booksDTO){
        Books books = new Books();
        books.setAuthor(booksDTO.getAuthor());
        books.setIsbnNo(booksDTO.getIsbnNo());
        books.setBookName(booksDTO.getBookName());
        bookRepository.save(books);
        return booksDTO;
    }
}
