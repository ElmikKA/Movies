package com.example.Movies.Repository;

import com.example.Movies.Models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Long> {
}
