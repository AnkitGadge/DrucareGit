package com.movieinfo.movieinfo.servicwe;

import org.springframework.web.bind.annotation.PathVariable;

import com.movieinfo.movieinfo.Entity.Movie;

public interface MovieInfo {
	public String hello() ;
	public Movie getMovieInfo(@PathVariable String movieId) ;
}
