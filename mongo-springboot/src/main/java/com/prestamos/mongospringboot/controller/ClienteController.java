package com.prestamos.mongospringboot.controller;

import com.prestamos.mongospringboot.models.Cliente;
import com.prestamos.mongospringboot.service.api.ClienteServiceApi;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente/api/v1")
@CrossOrigin("*")

@AllArgsConstructor
@NoArgsConstructor

public class ClienteController {

    @Autowired
    private ClienteServiceApi clienteServiceAPI;

    @GetMapping(value = "/all")
    public List<Cliente> getAll(){
        return clienteServiceAPI.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Cliente  find(@PathVariable Long id){
        return clienteServiceAPI.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Cliente>  save(@RequestBody Cliente cliente){
        Cliente obj = clienteServiceAPI.save(cliente);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Cliente>  delete(@PathVariable Long id){
        Cliente cliente = clienteServiceAPI.get(id);
        if (cliente != null){
            clienteServiceAPI.delete(id);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }
}
