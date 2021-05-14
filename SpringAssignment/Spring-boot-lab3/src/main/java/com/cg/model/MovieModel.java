package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MovieModel {
	
	@NotNull(message="Moviee Id cannot be null")
	@NotEmpty(message="Moviee Id cannot be Empty ")
	private Long movieId;

	@NotNull(message="Moviee Name cannot be null")
	@NotEmpty(message="Moviee Name cannot be Empty ")
	private String movieName;

	@NotNull(message="Moviee Genre cannot be null")
	@NotEmpty(message="Moviee Genre cannot be Empty ")
	private String Genre ;

	@NotNull(message="Moviee Rating cannot be null")
	@NotEmpty(message="Moviee Rating cannot be Empty ")
		private int Rating;
	
	public MovieModel() {
		//no implementation
	}

	public MovieModel(
			@NotNull(message = "Moviee Id cannot be null") @NotEmpty(message = "Moviee Id cannot be Empty ") Long movieId,
			@NotNull(message = "Moviee Name cannot be null") @NotEmpty(message = "Moviee Name cannot be Empty ") String movieName,
			@NotNull(message = "Moviee Genre cannot be null") @NotEmpty(message = "Moviee Genre cannot be Empty ") String genre,
			@NotNull(message = "Moviee Rating cannot be null") @NotEmpty(message = "Moviee Rating cannot be Empty ") int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		Genre = genre;
		Rating = rating;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Genre == null) ? 0 : Genre.hashCode());
		result = prime * result + Rating;
		result = prime * result + ((movieId == null) ? 0 : movieId.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieModel other = (MovieModel) obj;
		if (Genre == null) {
			if (other.Genre != null)
				return false;
		} else if (!Genre.equals(other.Genre))
			return false;
		if (Rating != other.Rating)
			return false;
		if (movieId == null) {
			if (other.movieId != null)
				return false;
		} else if (!movieId.equals(other.movieId))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MovieModel [movieId=" + movieId + ", movieName=" + movieName + ", Genre=" + Genre + ", Rating=" + Rating
				+ "]";
	}
	
	

}
