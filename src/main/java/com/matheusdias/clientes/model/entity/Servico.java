package com.matheusdias.clientes.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150, name ="descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes cliente;

    @Column
    private BigDecimal valor;

}
