package com.br.pdvpostocombustivel.venda.dto;

import com.br.pdvpostocombustivel.Enum.FormaPagamento;
import com.br.pdvpostocombustivel.Enum.StatusVenda;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record VendaResponse(
        Long id,
        LocalDateTime data,
        BigDecimal valorTotal,
        Long funcionarioId,
        String funcionarioNome,
        Long clienteId,
        String nomeCliente,
        Long caixaId, // Novo campo
        FormaPagamento formaPagamento,
        StatusVenda status,
        List<ItemVendaResponse> itens
) {
}