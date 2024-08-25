package com.allefmizael.watchlistapi.client;

import com.allefmizael.watchlistapi.model.Midia;
import com.allefmizael.watchlistapi.model.ResultadoPesquisa;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(value = "omdbClient", url = "${api.integracao.omdb.host}")
public interface OMDBClient {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    ResultadoPesquisa buscar(@RequestParam("s") String termoPesquisa,
                             @RequestParam("page") int page,
                             @RequestParam("apiKey") String apiKey);

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    Midia buscarPeloImdbId(@RequestParam("i") String imdbId, @RequestParam("apiKey") String apiKey);

}
