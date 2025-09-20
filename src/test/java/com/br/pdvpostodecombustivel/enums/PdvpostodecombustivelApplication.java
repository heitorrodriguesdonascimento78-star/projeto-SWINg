package com.br.pdvpostodecombustivel.enums;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdvpostodecombustivelApplication {

    public static <Pessoa> void main(String[] args) {

        //SpringApplication.run(PdvpostodecombustivelApplication.class, args);


        Pessoa pessoal = new Pessoa();
        pessoal.setApelido("Rud");
        pessoal.setId(1);
        pessoal.setIdade(19);
        pessoal.setNome("Rudson Porfirio");
        rp.salvaPessoa(pessoal);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setApelido("Fu");
        pessoa2.setId(2);
        pessoa2.setIdade(29);
        pessoa2.setNome("Fulano");
        rp.salvaPessoa(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setApelido("Zé");
        pessoa3.setId(3);
        pessoa3.setIdade(23);
        pessoa3.setNome("Jose Pereira");
        rp.salvaPessoa(pessoal);
    }
}