package com.nejdetkadirr.bookapp.repositories;

import com.nejdetkadirr.bookapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
