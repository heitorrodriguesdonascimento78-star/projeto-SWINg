package com.br.pdvpostocombustivel.api.Cliente.dto;

import com.br.pdvpostocombustivel.Enum.TipoPessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ClienteResponse(
        Long id,
        String nomeCompleto,
        String cpfCnpj,
        String email,
        String telefone, // Novo campo
        LocalDate dataNascimento,
        TipoPessoa tipoPessoa, // Novo campo
        BigDecimal limiteCredito,
        BigDecimal saldoAtual
) {
}