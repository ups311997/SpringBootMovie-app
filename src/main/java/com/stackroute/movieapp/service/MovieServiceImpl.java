package com.stackroute.movieapp.service;

import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.exceptions.MovieAlreadyExistsException;
import com.stackroute.movieapp.exceptions.MovieNotFoundException;
import com.stackroute.movieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }



    public Movie saveMovie(Movie movie) {

//        if(movieRepository.existsById(movie.getMovieid()))
//        {
//            throw new MovieAlreadyExistsException("Movie Already Exists");
//        }
        Movie savedMovie=movieRepository.save(movie);
//        if (savedMovie == null)
//        {
//            throw new MovieAlreadyExistsException("Movie Already Exists");
//        }
        return savedMovie;
    }

    public List<Movie> getAllMovies(){
        List<Movie> allMovies = movieRepository.getMovies();
        return allMovies;
    }

    public List<Movie> getMovieByName(String name) {
        List<Movie> movie=  movieRepository.findByName(name);
//        if (!movie.isPresent())
//            throw new MovieNotFoundException("Movie Not Found");

        return movie;
    }

    public void deleteMovie(int movieid){
        movieRepository.deleteById(movieid);
    }

    public Movie updateMovie(int id,Movie movie){
        Movie findMovie = movieRepository.findById(id).get();
        findMovie.setMoviedetails(movie.getMoviedetails());
        return movieRepository.save(findMovie);
    }
}
