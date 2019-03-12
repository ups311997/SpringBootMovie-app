package com.stackroute.movieapp.repository;

import com.stackroute.movieapp.domain.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
    @Query("Select m from Movie m")
    List<Movie> getMovies();

    @Query("Select m from Movie m where m.moviename = ?1")
    List<Movie> findByName(String name);
}
