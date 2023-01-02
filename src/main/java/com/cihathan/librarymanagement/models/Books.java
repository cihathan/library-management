package com.cihathan.librarymanagement.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name="books")
public class Books {
    @Id
    private Long isbnNo;

    @Column(name = "book_name")
    private String bookName;

    private String author;

}
