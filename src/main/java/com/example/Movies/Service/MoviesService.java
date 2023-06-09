package com.example.Movies.Service;

import com.example.Movies.Models.Movies;
import com.example.Movies.Repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    private final MoviesRepository moviesRepository;

    public MoviesService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movies> getAllMovies(){
        return moviesRepository.findAll();
    }

    public Movies getMovieById(Long id){
        return moviesRepository.findById(id).orElse(null);
    }

    public Movies saveMovie(Movies movies){
        return moviesRepository.save(movies);
    }

    public void deletedMovieById(Long id){
        moviesRepository.deleteById(id);
    }
}
