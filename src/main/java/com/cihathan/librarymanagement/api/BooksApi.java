package com.cihathan.librarymanagement.api;

import com.cihathan.librarymanagement.models.dtos.BooksDTO;
import com.cihathan.librarymanagement.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BooksApi {

    private final BookService bookService;
    @PostMapping(path = "/save")
    public BooksDTO save(@RequestBody BooksDTO booksDTO){
        return bookService.saveBook(booksDTO);
    }


    //update book

    @GetMapping(path = "")
    public BooksDTO getBookById(@RequestParam("bookId") Long bookId){
       return bookService.getBookById(bookId);
    }


//    @GetMapping(path = "/{bookId}")
//    public BooksDTO getBookById(@PathVariable Long bookId){
//        return bookService.getBookById(bookId);
//    }

    //GetAllBooks

    @GetMapping(path = "/all")
    public List<BooksDTO> findAllBooks(){
        return bookService.findAllBooks();
    }

    @DeleteMapping
    public BooksDTO deleteBookById(@RequestParam("bookId") Long bookId)
    {
        return bookService.deleteBook(bookId);
    }

    @PutMapping(path = "/update")
        public BooksDTO updateBook (@RequestBody BooksDTO booksDTO){
            return bookService.updateBook(booksDTO);
        }


}

