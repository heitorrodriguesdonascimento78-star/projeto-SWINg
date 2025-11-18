package com.br.pdvpostocombustivel.Produto.dto;

import com.br.pdvpostocombustivel.Enum.TipoProduto;

import java.math.BigDecimal;

public record ProdutoResponse(
        Long id,
        String nome,
        String descricao,
        String codigoBarras,
        BigDecimal precoVenda,
        BigDecimal custo,
        TipoProduto tipo,
        Double estoqueAtual
) {
}