package com.br.pdvpostocombustivel.venda.dto;

import com.br.pdvpostocombustivel.Enum.FormaPagamento;

import java.util.List;

public record VendaRequest(
        Long funcionarioId,
        Long clienteId, // Opcional, usado para CONTA_CLIENTE
        FormaPagamento formaPagamento,
        List<ItemVendaRequest> itens
) {
}