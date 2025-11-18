package com.br.pdvpostocombustivel.tanque.dto;

public record TanqueRequest(
        Double capacidade,
        Double nivelAtual,
        Long combustivelId
) {
}