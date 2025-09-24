package com.br.pdvpostodecombustivel.domain.repository.dto.pessoa.entity;
import org.springframework.format.annotation.DateTimeFormat;
import  java.time.localDate;
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
    { }}

