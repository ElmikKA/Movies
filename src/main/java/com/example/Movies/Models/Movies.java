package com.example.Movies.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieName;

    private Integer moviesYear;

    private Long moviesRating;

    private String moviesGenre;

    public Movies(){

    }

    public Movies(Long id, String movieName, Integer moviesYear, Long moviesRating, String moviesGenre) {
        this.id = id;
        this.movieName = movieName;
        this.moviesYear = moviesYear;
        this.moviesRating = moviesRating;
        this.moviesGenre = moviesGenre;
    }
}
