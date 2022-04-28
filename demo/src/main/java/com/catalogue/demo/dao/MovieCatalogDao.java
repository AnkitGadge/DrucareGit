package com.catalogue.demo.dao;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import org.springframework.web.client.RestTemplate;
import com.catalogue.demo.Entity.CatalogItem;
import com.catalogue.demo.Entity.Movie;
import com.catalogue.demo.Entity.UserRating;

@Repository

public class MovieCatalogDao  implements MovieCatalog{

	@Autowired
	private RestTemplate restTemplate;

	public List<CatalogItem> getCatalog(String userId) {

		UserRating userRating = restTemplate.getForObject("http://localhost:9003/ratingsdata/users", UserRating.class);
		System.out.println("******************output******************" + userRating);
		return userRating.getUserRating().stream().map(rating -> {

			Movie movie = restTemplate.getForObject("http://localhost:9002/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "aliens description", rating.getRating());
		}).collect(Collectors.toList());

	}
}