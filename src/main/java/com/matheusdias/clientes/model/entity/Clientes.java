package com.matheusdias.clientes.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "nome", length = 100)
    private String nome;

    @Column(nullable = false, name = "CPF", length = 11)
    private String cpf;

    @Column(name = "Data_cadastro")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

//    @PrePersist
//    public void prePersist() {
//        setDataCadastro(LocalDate.now());
//    }
}
