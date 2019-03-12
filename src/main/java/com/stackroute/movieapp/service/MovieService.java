package com.stackroute.movieapp.service;

import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.exceptions.MovieAlreadyExistsException;
import com.stackroute.movieapp.exceptions.MovieNotFoundException;

import java.util.List;

public interface MovieService {
    public Movie saveMovie(Movie movie) throws MovieAlreadyExistsException;
    public List getAllMovies();
    public List<Movie> getMovieByName(String name)throws MovieNotFoundException;


}
