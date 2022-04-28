package com.movieinfo.movieinfo.dao;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.movieinfo.Entity.Movie;

@RestController
@RequestMapping("/movies")
public interface MovieResourceDao {
	public Movie getMovieInfo(@PathVariable String movieId);

	public String hello();
}