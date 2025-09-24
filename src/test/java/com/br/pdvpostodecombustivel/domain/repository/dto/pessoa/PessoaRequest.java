package com.br.pdvpostodecombustivel.domain.repository.dto.pessoa;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record PessoaRequest(
        String nomeCompleto,
        String CpfCnpj,
        long numeroCtps,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate dataNascimento) {}
