package dev.somallef.WatchList.domain;

import com.fasterxml.jackson.annotation.JsonAlias;

public record TVSeriesData(
        @JsonAlias("Title") String title,
        @JsonAlias("totalSeasons") Integer totalSeasons,
        @JsonAlias("imdbRating") String imdbRating) {
}

