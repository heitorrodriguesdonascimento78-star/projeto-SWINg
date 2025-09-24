package com.br.pdvpostodecombustivel.domain.repository.dto.pessoa.entity;
import com.br.pdvpostodecombustivel.enums.TipoPessoa;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pessoa")

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name  = "nome_completo", length = 200, nullable = false)
        private String nomeCompleto;

    @Column(name =  "cpf_Cnpj",length = 14, nullable = false)
        private String cpfCnpj;

    @Column(name = "data_nascimento",length = 10, nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 10, nullable = false)
    private long numeroCtps;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", nullable = false, length = 15)
    private TipoPessoa tipoPessoa;

    public Pessoa(String nomeCompleto, String cpfCnpj, LocalDate dataNascimento, Integer numeroCtps){
    this.nomeCompleto = nomeCompleto;
    this.dataNascimento = dataNascimento;
    this.numeroCtps = numeroCtps;
    this.cpfCnpj = cpfCnpj;
    this.tipoPessoa = tipoPessoa;
}
public Pessoa(){}

    public String getNomeCompleto(){ return nomeCompleto;}

   public void setNomeCompleto(String nomeCompleto){this.nomeCompleto = nomeCompleto;}
   public String getCpfCnpj(){ return cpfCnpj;}
   public void setCpfCnpj(String cpfCnpj){this.cpfCnpj = cpfCnpj;}
   public LocalDate getDataNascimento(){return dataNascimento;}
   public void setDataNascimento(LocalDate dataNascimento){this.dataNascimento = dataNascimento;}
   public Integer getNumeroCtps(){ return Math.toIntExact(numeroCtps);}
   public void setNumeroCtps(Integer numeroCtps){this.numeroCtps = numeroCtps;}

}

