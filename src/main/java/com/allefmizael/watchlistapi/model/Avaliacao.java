package com.allefmizael.watchlistapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Avaliacao(
        @JsonAlias("Source")
        String fonte,
        @JsonAlias("Value")
        String valor
) {
}
