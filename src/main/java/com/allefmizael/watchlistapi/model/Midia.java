package com.allefmizael.watchlistapi.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "Type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Filme.class, name = "movie"),
        @JsonSubTypes.Type(value = Serie.class, name = "series")
})
public abstract class Midia {

    @JsonAlias("Title")
    private String titulo;

    @JsonAlias("Type")
    private String tipo;

    @JsonAlias("Year")
    private String ano;

    @JsonAlias("Released")
    private String dataLancamento;

    @JsonAlias("Runtime")
    private String duracao;

    @JsonAlias("Genre")
    private String genero;

    @JsonAlias("Plot")
    private String sinopse;

    @JsonAlias("Poster")
    private String posterUrl;

    @JsonAlias("Ratings")
    private Collection<Avaliacao> avaliacoes;

}
