package com.allefmizael.watchlistapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Collection;

public record ResultadoPesquisa(
        @JsonAlias("Search")
        Collection<ItemResultado> itens,
        @JsonAlias("totalResults")
        Long quantidadeItens,
        @JsonAlias("Response")
        boolean response

) {
}
