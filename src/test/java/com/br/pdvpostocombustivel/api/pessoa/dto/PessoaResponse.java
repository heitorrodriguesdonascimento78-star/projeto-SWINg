package com.br.pdvpostocombustivel.api.pessoa.dto;

import com.br.pdvpostocombustivel.pdvpostodecombustivel.enums.TipoPessoa;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

// Para resposta

    public record PessoaResponse(
            String nomeCompleto,
            String cpfCnpj,
            Long numeroCtps,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate dataNascimento, TipoPessoa TipoPessoa)
            {
                public static record PessoaResponse(String nomeCompleto, String cpfCnpj, Long numeroCtps, LocalDate dataNascimento){}
            }

