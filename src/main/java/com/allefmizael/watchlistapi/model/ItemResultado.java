package com.allefmizael.watchlistapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemResultado(
        @JsonAlias("Title")
        String titulo,
        @JsonAlias("Year")
        String ano,
        @JsonAlias("imdbID")
        String imdbId,
        @JsonAlias("Type")
        @JsonProperty("tipo")
        String tipo,
        @JsonAlias("Poster")
        String posterUrl

) {
}
