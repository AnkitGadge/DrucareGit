package com.movieinfo.movieinfo.dao;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieinfo.movieinfo.Entity.Movie;

public class MovieResourceDaoImpl implements MovieResourceDao {

	
	public Movie getMovieInfo(@PathVariable String movieId) {
		System.out.println("**********************");
		return new Movie(movieId, "movie name is spiderman");
		
	}
	
	public String hello() {
		System.out.println("hello");
		return "hello";
	}

}
