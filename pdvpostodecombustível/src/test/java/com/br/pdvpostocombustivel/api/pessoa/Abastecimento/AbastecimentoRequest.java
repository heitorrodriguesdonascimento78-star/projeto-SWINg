package com.br.pdvpostocombustivel.api.pessoa.Abastecimento;

public record AbastecimentoRequest(
        Long bombaId,
        Double litrosAbastecidos
) {
}