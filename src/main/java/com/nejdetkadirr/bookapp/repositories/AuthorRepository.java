package com.nejdetkadirr.bookapp.repositories;

import com.nejdetkadirr.bookapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
