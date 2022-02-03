package com.matheusdias.clientes.model.repository;

import com.matheusdias.clientes.model.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
