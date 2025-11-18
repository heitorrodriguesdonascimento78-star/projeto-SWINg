package com.br.pdvpostocombustivel.pdvpostodecombustivel.domain.repository.dto.pessoa.entity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Objects;

public class PessoaDTo {
    //para entrada
        public static final class PessoaRequest {
        private final String nomeCompleto;
        private final String cpfCnpj;
        private final long numeroCtps;
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        private final localDate dataNascimento;

        public PessoaRequest(

                String nomeCompleto,
                String cpfCnpj,
                long numeroCtps,
                @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                localDate dataNascimento () {
            this.nomeCompleto = nomeCompleto;
            this.cpfCnpj = cpfCnpj;
            this.numeroCtps = numeroCtps;
            this.dataNascimento = dataNascimento;
        }

        public String nomeCompleto() {
            return nomeCompleto;
        }

        public String cpfCnpj() {
            return cpfCnpj;
        }

        public long numeroCtps() {
            return numeroCtps;
        }

        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        public localDate dataNascimento() {
            return dataNascimento;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (PessoaRequest) obj;
            return Objects.equals(this.nomeCompleto, that.nomeCompleto) &&
                    Objects.equals(this.cpfCnpj, that.cpfCnpj) &&
                    this.numeroCtps == that.numeroCtps &&
                    Objects.equals(this.dataNascimento, that.dataNascimento);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nomeCompleto, cpfCnpj, numeroCtps, dataNascimento);
        }

        @Override
        public String toString() {
            return "PessoaRequest[" +
                    "nomeCompleto=" + nomeCompleto + ", " +
                    "cpfCnpj=" + cpfCnpj + ", " +
                    "numeroCtps=" + numeroCtps + ", " +
                    "dataNascimento=" + dataNascimento + ']';
        }
    }
    public record PessoaResponde(
            long id,
            String nomeCompleto,
            String cpfCnpj,
            long numeroCtps

 ){}
}

