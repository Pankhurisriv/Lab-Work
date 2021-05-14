package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.dao.IMovieRepository;
import com.cg.entity.MovieEntity;
import com.cg.exception.MovieIdNotFoundException;
import com.cg.model.MovieModel;

public class MovieServiceImpl implements IMovieService {
	

	@Autowired
	private IMovieRepository movieDAO;
	
	@Autowired
	private EMParser parser;
	
	public MovieServiceImpl() {
		this.parser = new EMParser();
	}
	
   public MovieServiceImpl(IMovieRepository movieDAO) {
		super();
		this.movieDAO = movieDAO;
		this.parser = new EMParser();
   }
	

	@Override
	public MovieModel addMovie(MovieModel movieModel) throws MovieIdNotFoundException {
		if (movieModel != null) {
			if (movieDAO.existsById(movieModel.getMovieId())) {
				throw new MovieIdNotFoundException ("movie with this id already exists");
			}

			movieModel = parser.parse(movieDAO.save(parser.parse(movieModel)));
		}

		return movieModel;
	}

	@Override
	public MovieModel viewMovieByCategory(String Genre) throws MovieIdNotFoundException {
		MovieEntity oldMovie = movieDAO.findByCategory(Genre);
		if (oldMovie == null) {
			throw new MovieIdNotFoundException("no movie with category " + Genre + "exsits");
		}
		return parser.parse(movieDAO.findById(oldMovie.getMovieId()).orElse(null));
	}

}
