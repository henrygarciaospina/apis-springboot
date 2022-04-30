package com.prestamos.mongospringboot.dao.api;

import com.prestamos.mongospringboot.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
