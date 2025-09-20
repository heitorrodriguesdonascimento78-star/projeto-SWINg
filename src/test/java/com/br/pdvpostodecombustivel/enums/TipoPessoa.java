package com.br.pdvpostodecombustivel.enums;

public enum TipoPessoa {
    FISICA("Pessoa Fisica")
    JURIDICA("Pessoa juritica")

        private final String descricao;
    private TipoPessoa(String descricao){
        this.descricao = descricao;{
        }
        public String getDescricao() {
            return descricao;
        }
    }
}
