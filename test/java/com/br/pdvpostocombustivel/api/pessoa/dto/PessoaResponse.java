package com.br.pdvpostocombustivel.api.pessoa.dto;

import com.br.pdvpostocombustivel.pdvpostodecombustivel.enums.TipoPessoa;

import java.time.LocalDate;

// Para resposta
public record PessoaResponse(
        String nomeCompleto,
        String cpfCnpj,
        Long numeroCtps,
        LocalDate dataNascimento
){
    public TipoPessoa tipoPessoa() {
    }
}