package com.nejdetkadirr.bookapp.repositories;

import com.nejdetkadirr.bookapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
