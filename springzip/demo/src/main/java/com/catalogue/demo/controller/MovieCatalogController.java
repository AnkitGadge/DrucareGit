package com.catalogue.demo.controller;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.catalogue.demo.Entity.CatalogItem;
import com.catalogue.demo.Entity.Movie;
import com.catalogue.demo.Model.UserRating;

@RestController
@Controller
@RequestMapping("/catalog")
public class MovieCatalogController {
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId) {
		UserRating userRating = restTemplate.getForObject("http://localhost:9003/ratingsdata/users", UserRating.class);
		System.out.println("******************output******************" + userRating);
		return userRating.getUserRating().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:9002/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "aliens description", rating.getRating());
		}).collect(Collectors.toList());
	}
}