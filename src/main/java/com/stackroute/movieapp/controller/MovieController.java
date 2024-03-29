package com.stackroute.movieapp.controller;

import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    private MovieServiceImpl movieService;
    @Autowired
    public MovieController(MovieServiceImpl movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        Movie savedMovie = movieService.saveMovie(movie);
        return new ResponseEntity<Movie>(savedMovie, HttpStatus.OK);
    }

    @GetMapping("/movies")
    public ResponseEntity<List> getAllMovies(){
        List<Movie> allUsers= movieService.getAllMovies();
        return new ResponseEntity<List>(allUsers,HttpStatus.OK);
    }

    @GetMapping("/movies/{movieid}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int movieid){
        Movie getMovieById = movieService.getMovieById(movieid);
        return new ResponseEntity<Movie>(getMovieById,HttpStatus.OK);
    }
    @DeleteMapping("/movies/{movieid}")
    public ResponseEntity<List> deleteMovie(@PathVariable int movieid){
        movieService.deleteMovie(movieid);
        return new ResponseEntity<List>(movieService.getAllMovies(),HttpStatus.OK);

    }
    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable int id,@RequestBody Movie movie){
        Movie updatedMovie = movieService.updateMovie(id,movie);
        return new ResponseEntity<Movie>(updatedMovie,HttpStatus.OK);

    }
}
