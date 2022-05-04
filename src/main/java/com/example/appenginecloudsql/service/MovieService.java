package com.example.appenginecloudsql.service;

import com.example.appenginecloudsql.model.Movie;
import com.example.appenginecloudsql.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll(){
        return movieRepository.findAll();
    };

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> findByName(String movieName) {
        return movieRepository.findByName(movieName);
    }
}
