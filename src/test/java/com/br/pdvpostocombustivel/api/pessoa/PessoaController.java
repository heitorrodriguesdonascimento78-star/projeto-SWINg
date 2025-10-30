package com.br.pdvpostocombustivel.api.pessoa;


import com.br.pdvpostocombustivel.api.pessoa.dto.PessoaRequest;
import com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse;
import com.br.pdvpostocombustivel.api.pessoa.dto.PessoaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse.PessoaResponse create(@RequestBody com.br.pdvpostocombustivel.api.pessoa.PessoaRequest req) {
        return service.create(req);
    }

    @GetMapping("/{id}")
    public com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse.PessoaResponse get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping(params = "cpfCnpj")
    public com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse.PessoaResponse getByCpf(@RequestParam String cpfCnpj) {
        return service.getByCpfCnpj(cpfCnpj);
    }

    @GetMapping
    public Page<com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse.PessoaResponse> list(@RequestParam(defaultValue = "0") int page,
                                                                                              @RequestParam(defaultValue = "10") int size,
                                                                                              @RequestParam(defaultValue = "id") String sortBy,
                                                                                              @RequestParam(defaultValue = "ASC") Sort.Direction dir) {
        return service.list(page, size, sortBy, dir);
    }

    @PutMapping("/{id}")
    public com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse.PessoaResponse update(@PathVariable Long id, @RequestBody PessoaRequest req) {
        return service.update(id, req);
    }

    @PatchMapping("/{id}")
    public PessoaResponse.PessoaResponse patch(@PathVariable Long id, @RequestBody PessoaRequest req) {
        return service.patch(id, req);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}