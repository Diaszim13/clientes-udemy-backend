package com.matheusdias.clientes.model.controllers;

import com.matheusdias.clientes.model.entity.Clientes;
import com.matheusdias.clientes.model.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
@CrossOrigin("http://localhost:4200") //corigindo problema de cors
public class ClienteController {

    private final ClientesRepository repository;

    @Autowired
    public ClienteController(ClientesRepository clientesRepository) {
        this.repository = clientesRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes salvar(@RequestBody Clientes cliente) {
        return repository.save(cliente);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Clientes acharPorId(@PathVariable Long id) {
        return repository.getById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Clientes> achar() {
        return repository.findAll();
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
        public void deletar(@PathVariable Long id) {
            repository.findById(id).map(cliente -> {
                repository.delete(cliente);
                return Void.TYPE;
            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void atualizar (@PathVariable Long id, @RequestBody Clientes clienteAtt) {
        if(id != null) {
            repository.findById(id).map(cliente -> {
                clienteAtt.setId(cliente.getId());
                return repository.save(clienteAtt);
            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        }
    }
}
