package com.cihathan.librarymanagement.api;

import com.cihathan.librarymanagement.models.dtos.BooksDTO;
import com.cihathan.librarymanagement.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    //getBookById

    //GetAllBooks

}
