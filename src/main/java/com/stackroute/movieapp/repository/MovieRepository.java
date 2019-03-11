package com.stackroute.movieapp.repository;

import com.stackroute.movieapp.domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
