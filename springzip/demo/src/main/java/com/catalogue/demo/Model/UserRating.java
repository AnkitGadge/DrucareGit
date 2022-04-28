package com.catalogue.demo.Model;

import java.util.List;

import com.catalogue.demo.Entity.Rating;

public class UserRating {

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

	public UserRating() {
	}

	private List<Rating> userRating;
}