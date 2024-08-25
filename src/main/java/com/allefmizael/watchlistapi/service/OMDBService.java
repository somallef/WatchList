package com.allefmizael.watchlistapi.service;

import com.allefmizael.watchlistapi.client.OMDBClient;
import com.allefmizael.watchlistapi.model.Midia;
import com.allefmizael.watchlistapi.model.ResultadoPesquisa;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class OMDBService {

    private final OMDBClient omdbClient;

    @Value("${api.integracao.omdb.apiKey}")
    private String apiKey;

    public Midia buscarPeloImdbId(String titulo) {
        var response = omdbClient.buscarPeloImdbId(titulo, apiKey);
        return omdbClient.buscarPeloImdbId(titulo, apiKey);
    }

    public ResultadoPesquisa buscar(String termoPesquisa, int page) {
        var response = omdbClient.buscar(termoPesquisa, page, apiKey);
        return omdbClient.buscar(termoPesquisa, page, apiKey);
    }

}
