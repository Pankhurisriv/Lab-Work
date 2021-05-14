package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class MovieEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
        @Id
		@Column(name = "movie_id")
		private Long movieId;

		@Column(name = "movie_name")
		private String movieName;

		@Column(name = "movie_genre")
		private String Genre ;

		@Column(name = "movie_rating")
		private int Rating;
		
		public MovieEntity() {
			//no implementations
		}

		public MovieEntity(Long movieId, String movieName, String genre, int rating) {
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
			MovieEntity other = (MovieEntity) obj;
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
			return "MovieEntity [movieId=" + movieId + ", movieName=" + movieName + ", Genre=" + Genre + ", Rating="
					+ Rating + "]";
		}

		
		

		

}
