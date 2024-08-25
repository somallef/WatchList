package com.allefmizael.watchlistapi.controller;

import com.allefmizael.watchlistapi.model.Midia;
import com.allefmizael.watchlistapi.model.ResultadoPesquisa;
import com.allefmizael.watchlistapi.service.OMDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/watchlist/v1/midia")
public class MidiaController {

    private final OMDBService omdbService;

    @GetMapping
    public ResponseEntity<ResultadoPesquisa> buscar(
            @RequestParam String termoPesquisa,
            @RequestParam(defaultValue = "1") String page
            ) {
        var resultado = omdbService.buscar(termoPesquisa, Integer.parseInt(page));
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Midia> buscarPeloImdbId(
            @PathVariable String imdbId) {
        var resultado = omdbService.buscarPeloImdbId(imdbId);
        return ResponseEntity.ok(resultado);
    }
}
