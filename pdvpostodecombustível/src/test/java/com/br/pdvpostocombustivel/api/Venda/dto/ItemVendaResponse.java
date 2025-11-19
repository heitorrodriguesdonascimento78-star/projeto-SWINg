package com.br.pdvpostocombustivel.venda.dto;

import java.math.BigDecimal;

public record ItemVendaResponse(
        Long produtoId,
        String nomeProduto,
        Double quantidade,
        BigDecimal precoUnitario,
        BigDecimal subtotal
) {
}