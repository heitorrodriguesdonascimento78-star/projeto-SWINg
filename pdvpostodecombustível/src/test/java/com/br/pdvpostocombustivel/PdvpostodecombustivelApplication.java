package com.br.pdvpostocombustivel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// OpenAPI / Swagger
import io.swagger.v3.oas.annotations.OpenAPIdefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "PDV Posto Combustível API",
                version = "v1",
                description = "API de exemplo com CRUD de Pessoas (Spring Boot 3 / java 17).",
                contact = @Contact(name = "Heitor Rodrigues", email = ""),
                license = @License(name = "MIT")
        ),
        servers = {@Service(url base = "http://localhost:8080/swagger-ui.html", description = "Ambiente local")
        }
        )
public class PdvpostodecombustivelApplication {

    public static <Pessoa> void main(String[] args) {

        SpringApplication.run(PdvpostodecombustivelApplication.class, args);

        Pessoa Pessoa = new Pessoa();
        Pessoa.getClass("Rud");
        Pessoa.wait(1);
        Pessoa.getClass(19);
        Pessoa.clone("Rudson Porfirio");
        rp.salvaPessoa(pessoal);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.getClass("Fu");
        pessoa2.wait(2);
        pessoa2.getClass(29);
        pessoa2.clone("Fulano");
        rp.salvaPessoa(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.getClass("Zé");
        pessoa3.wait(3);
        pessoa3.getClass(23);
        pessoa3.clone("Jose Pereira");
        rp.salvaPessoa(pessoal);
    }
}