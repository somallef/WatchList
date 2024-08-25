package com.allefmizael.watchlistapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Serie extends Midia {

    @JsonAlias("totalSeasons")
    private String quantidadeTemporadas;
}
