package com.cag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cag.Model.TraineeModel;
import com.cag.exception.TraineeIdNotFoundException;
import com.cag.service.ITraineeService;

@RestController
@RequestMapping(path="/trainee")
@CrossOrigin
public class TraineeRestController {
	 @Autowired
	    private ITraineeService traineeService;
	 
	 
	    //add trainee
	    //return : trainee details
	    //params : NIL
	    @PostMapping
	    public ResponseEntity<TraineeModel> addTrainee(
	            @RequestBody TraineeModel traineeModel 
	           ) throws TraineeIdNotFoundException {
	        
	    	  traineeModel = traineeService.addTrainee(traineeModel);
				return new ResponseEntity<>(traineeModel, HttpStatus.CREATED);
	    }
	    
	  //update trainee
	    //return : trainee
	    // params : trainee 
	    @PutMapping("/{traineeId}")
	    public ResponseEntity<TraineeModel> updateTrainee
	    (@RequestBody TraineeModel traineeModel) throws TraineeIdNotFoundException {
	    	 traineeModel = traineeService.updateTrainee( traineeModel);
		        return new ResponseEntity<>( traineeModel, HttpStatus.OK);
	    }
	    
	    //delete trainee with id
	    //return : void
	    //params : trainee id
	    @DeleteMapping("/{traineeId}")
	    public ResponseEntity<Boolean> RemoveTrainee(@PathVariable("traineeId") Long traineeId) throws TraineeIdNotFoundException {
	    	   ResponseEntity<Boolean> response = null;
	    	   TraineeModel t = traineeService.viewTraineeById(traineeId);
	    				if (t == null) {
	    					response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    					
	    				} else {
	    					traineeService.removeTrainee(traineeId);
	    					response = new ResponseEntity<>(HttpStatus.OK);
	    					
	    				}
	    				return response;
	    }
	    
	  //get trainee  with id
	    //return  : single trainee
	    //params : trainee id
	    @GetMapping("/{traineeId}")
	    public ResponseEntity<TraineeModel> viewTraineeById(@PathVariable("traineeId") Long traineeId) throws TraineeIdNotFoundException {
	    ResponseEntity<TraineeModel> response = null;
	    TraineeModel trainee = traineeService.viewTraineeById(traineeId);
	    if (trainee == null) {
	        response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } else {
	    	traineeService.viewTraineeById(traineeId);
	        response = new ResponseEntity<>(trainee, HttpStatus.OK);
	    }
	    return response;
	    
	    }
	    
	    //get all trainee
	    //return : all trainees
	    //params : NIL
	     @GetMapping
		public ResponseEntity<List<TraineeModel>> viewAllTrainees() throws TraineeIdNotFoundException {
			return new ResponseEntity<>(traineeService.viewallTrainee(), HttpStatus.OK);

		}
	    
		
	
}


