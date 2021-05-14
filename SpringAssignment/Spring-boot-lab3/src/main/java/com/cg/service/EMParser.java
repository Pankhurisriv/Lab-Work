package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.dao.IMovieRepository;
import com.cg.entity.MovieEntity;
import com.cg.model.MovieModel;



public class EMParser {
	@Autowired
	private IMovieRepository movieDAO;
	
	public EMParser() {
		this.movieDAO= movieDAO;
	}

	public EMParser(IMovieRepository movieDAO) {
		super();
		this.movieDAO = movieDAO;
	}
	//convert movie entity to movie model
		 public MovieEntity parse(MovieModel source) {
				return source==null?null:
					new MovieEntity(source.getMovieId(), 
							source.getMovieName(),
							source.getGenre(),
							source.getRating()
							);
			}
		 
		 //conert movie model to entity
		 public MovieModel parse(MovieEntity source) {
				return source==null?null:
					new MovieModel(source.getMovieId(), 
							source.getMovieName(),
							source.getGenre(),
							source.getRating()
							);
			}
		 
		 
	
	
	

}

