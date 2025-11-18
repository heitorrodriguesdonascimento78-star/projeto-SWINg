package com.br.pdvpostocombustivel.api.Cliente.dto;

import java.math.BigDecimal;

public record PagamentoRequest(
        BigDecimal valor
) {
}