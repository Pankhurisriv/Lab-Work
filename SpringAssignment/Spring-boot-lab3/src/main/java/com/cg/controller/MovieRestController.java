package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.exception.MovieIdNotFoundException;
import com.cg.model.MovieModel;
import com.cg.service.IMovieService;

@RestController
@RequestMapping(path="/movie")
@CrossOrigin
public class MovieRestController {
	@Autowired
    private IMovieService movieService;
	
	  //add movie
    //return : movie details
    //params : NIL
    @PostMapping
    public ResponseEntity<MovieModel> addMovie(
            @RequestBody MovieModel movieModel
           ) throws MovieIdNotFoundException {
        
    	movieModel = movieService.addMovie(movieModel);
			return new ResponseEntity<>(movieModel, HttpStatus.CREATED);
    }
    
    @GetMapping("/{category}")
	public ResponseEntity<MovieModel> viewMovieByCategory(@PathVariable("category") String Genre) throws MovieIdNotFoundException {
		ResponseEntity<MovieModel> response = null;
		MovieModel movie = movieService.viewMovieByCategory(Genre);
		
		if (movie == null) {
			 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		} else {
			response = ResponseEntity.ok(movie);
		}
		return response;
	}
	

}
