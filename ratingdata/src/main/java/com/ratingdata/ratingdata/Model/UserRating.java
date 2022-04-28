package com.ratingdata.ratingdata.Model;

import java.util.List;

import com.ratingdata.ratingdata.Entity.Rating;

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