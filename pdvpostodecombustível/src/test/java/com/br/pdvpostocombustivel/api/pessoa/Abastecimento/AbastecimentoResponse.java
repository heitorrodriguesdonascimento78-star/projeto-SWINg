package com.br.pdvpostocombustivel.api.pessoa.Abastecimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AbastecimentoResponse(
        Long id,
        Long bombaId,
        Integer numeroBomba,
        Long combustivelId,
        String nomeCombustivel,
        Double litrosAbastecidos,
        BigDecimal valorLitro,
        BigDecimal valorTotal,
        LocalDateTime dataHora
) {
}