package com.br.pdvpostocombustivel.tanque.dto;

import java.time.LocalDateTime;

public record TanqueResponse(
        Long id,
        Double capacidade,
        Double nivelAtual,
        Long combustivelId,
        String nomeCombustivel,
        LocalDateTime ultimaLeitura,
        LocalDateTime dataUltimaEntrega
) {
}