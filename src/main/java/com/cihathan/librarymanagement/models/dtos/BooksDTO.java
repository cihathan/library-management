package com.cihathan.librarymanagement.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BooksDTO {
//    public BooksDTO(Long isbnNo, String bookName, String author) {
//        this.isbnNo = isbnNo;
//        this.bookName = bookName;
//        this.author = author;
//    }
//
//    public BooksDTO() {
//    }

    private Long isbnNo;

    private String bookName;

    private String author;


}
