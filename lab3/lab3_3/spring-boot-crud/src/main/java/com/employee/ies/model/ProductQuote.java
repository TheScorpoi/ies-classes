package com.employee.ies.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.ies.repository.MovieRepository;

import java.util.List;

@Service
public class ProductQuote {
    @Autowired
    private MovieRepository repository;

    public List<Movie> saveMovies(List<Movie> movies) {
        return repository.saveAll(movies);
    }

    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }

    public List<Movie> getMovies() {
        return repository.findAll();
    }

    public Movie getMovieByName(String title) {
        return repository.findByTitle(title);
    }

    public Movie getMovieById(long id) {
        return repository.findById((int) id).orElse(null);
    }

    public Movie updateMovie(Movie movie) {
        Movie existingMovie = repository.findById((int) movie.getId()).orElse(null);
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setYear(movie.getYear());
        return repository.save(existingMovie);
    }

    public String deleteMovie(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

}