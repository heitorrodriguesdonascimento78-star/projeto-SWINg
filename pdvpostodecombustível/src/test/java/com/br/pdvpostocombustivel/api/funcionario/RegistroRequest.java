package com.br.pdvpostocombustivel.Funcionario;

public record RegistroRequest(
        String nomeCompleto,
        String email,
        String senha,
        String cpfCnpj,
        String dataNascimento,
        String tipoPessoa
) {
}