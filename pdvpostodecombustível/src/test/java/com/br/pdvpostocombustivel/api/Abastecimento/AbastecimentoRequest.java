package com.br.pdvpostocombustivel.api.Abastecimento;

public record AbastecimentoRequest(
        Long bombaId,
        Double litrosAbastecidos
) {
}