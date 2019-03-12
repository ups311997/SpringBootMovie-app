package com.stackroute.movieapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieid;
    private String moviename;
    private String moviedetails;

    public Movie() {
    }

    public Movie(int movieid, String moviename, String moviedetails) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.moviedetails = moviedetails;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviedetails() {
        return moviedetails;
    }

    public void setMoviedetails(String moviedetails) {
        this.moviedetails = moviedetails;
    }
}

