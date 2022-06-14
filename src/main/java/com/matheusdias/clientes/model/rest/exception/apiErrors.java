package com.matheusdias.clientes.model.rest.exception;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class apiErrors {

    @Getter
    private List<String> erros;

    public apiErrors(List<String> erros) {
        this.erros = erros;
    }

    public void apiErrors(String message) {
        this.erros = Arrays.asList(message);
    }
}
