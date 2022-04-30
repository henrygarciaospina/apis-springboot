package com.prestamos.mongospringboot.service.impl;

import com.prestamos.mongospringboot.commons.GenericServiceImpl;
import com.prestamos.mongospringboot.dao.api.ClienteRepository;
import com.prestamos.mongospringboot.models.Cliente;
import com.prestamos.mongospringboot.service.api.ClienteServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteServiceApi {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }
}
