package com.cg.service;

import com.cg.exception.MovieIdNotFoundException;
import com.cg.model.MovieModel;

public interface IMovieService {
	public MovieModel addMovie(MovieModel movieModel) throws MovieIdNotFoundException;
	
	public MovieModel viewMovieByCategory(String Genre) throws MovieIdNotFoundException;

}
