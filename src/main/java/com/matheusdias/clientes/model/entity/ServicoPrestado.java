package com.matheusdias.clientes.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ServicoPrestado {

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

    @Column
    private LocalDate data;

}
