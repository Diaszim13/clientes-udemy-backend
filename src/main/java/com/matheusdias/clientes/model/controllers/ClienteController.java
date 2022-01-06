package com.matheusdias.clientes.model.controllers;

import com.matheusdias.clientes.model.entity.Clientes;
import com.matheusdias.clientes.model.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private ClientesRepository repository;
    @Autowired
    public ClienteController(ClientesRepository clientesRepository) {
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes salvar(@RequestBody Clientes cliente) {
        return repository.save(cliente);
    }
}
