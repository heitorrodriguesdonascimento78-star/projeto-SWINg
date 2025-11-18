package com.br.pdvpostocombustivel.api.Cliente.dto;

import com.br.pdvpostocombustivel.Enum.TipoMovimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record MovimentoContaClienteResponse(
        Long id,
        TipoMovimento tipo,
        BigDecimal valor,
        LocalDateTime dataHora,
        String descricao
) {
}