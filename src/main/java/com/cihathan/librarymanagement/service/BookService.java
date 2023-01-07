package com.cihathan.librarymanagement.service;

import com.cihathan.librarymanagement.models.Books;
import com.cihathan.librarymanagement.models.dtos.BooksDTO;
import com.cihathan.librarymanagement.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


    public BooksDTO getBookById(Long bookId) {
        Optional<Books> bookOpt = bookRepository.findById(bookId);
        Books book = bookOpt.orElseThrow();

        //model to dto
        BooksDTO booksDTO = new BooksDTO();
        booksDTO.setBookName(book.getBookName());
        booksDTO.setAuthor(book.getAuthor());
        booksDTO.setIsbnNo(book.getIsbnNo());
        return  booksDTO;
    }

    public List<BooksDTO> findAllBooks(){
        List<Books> books = bookRepository.findAll();
        List<BooksDTO> booksDto = new ArrayList<>();
        for ( Books book : books) {
            BooksDTO booksDTO = new BooksDTO();
            booksDTO.setBookName(book.getBookName());
            booksDTO.setAuthor(book.getAuthor());
            booksDTO.setIsbnNo(book.getIsbnNo());
            booksDto.add(booksDTO);
        }
        return booksDto;
    }

    public BooksDTO deleteBook(Long bookId){
       BooksDTO deleteBook = getBookById(bookId);
       bookRepository.deleteById(bookId);
       return deleteBook;
    }

    public BooksDTO updateBook(BooksDTO booksDTO) {

        Books books = new Books();
        books.setIsbnNo(books.getIsbnNo());
        books.setBookName(books.getBookName());
        books.setAuthor(books.getAuthor());
        return booksDTO;
    }
}
