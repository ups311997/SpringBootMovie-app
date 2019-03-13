package com.stackroute.movieapp;

import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DbInitializer implements CommandLineRunner, ApplicationListener<ContextRefreshedEvent> {
    private MovieRepository movieRepository;

    public DbInitializer(MovieRepository movieRepository){
        this.movieRepository=movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Movie movie1=new Movie(3,"Stree","Horror-Comedy");
        Movie movie2=new Movie(4,"Conjuring","Horror");

        this.movieRepository.save(movie1);
        this.movieRepository.save(movie2);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Movie movie1=new Movie(1,"Annabelle","Horror");
        Movie movie2=new Movie(2,"Conjuring2","Super-Horror");

        this.movieRepository.save(movie1);
        this.movieRepository.save(movie2);
    }
}
