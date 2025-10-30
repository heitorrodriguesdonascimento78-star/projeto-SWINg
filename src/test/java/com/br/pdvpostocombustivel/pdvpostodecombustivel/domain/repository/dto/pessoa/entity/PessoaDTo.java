package com.br.pdvpostocombustivel.pdvpostodecombustivel.domain.repository.dto.pessoa.entity;
import org.springframework.format.annotation.DateTimeFormat;

public class PessoaDTo {
//para entrada
    public record PessoaRequest(

        String nomeCompleto,
        String cpfCnpj,
        long numeroCtps,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        localDate dataNascimento()
    public record PessoaResponde(
            long id,
            String nomeCompleto,
            String cpfCnpj,
            long numeroCtps

 ){}
}

