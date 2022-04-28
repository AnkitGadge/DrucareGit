package com.movieinfo.movieinfo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.movieinfo.Entity.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResourceController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		System.out.println("**********************");
		return new Movie(movieId, "movie name is spiderman");
		
	}
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "hello";
	}

}