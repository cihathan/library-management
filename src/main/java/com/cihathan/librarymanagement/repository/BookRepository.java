package com.cihathan.librarymanagement.repository;

import com.cihathan.librarymanagement.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long> {
}
