package com.cag.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.cag.Model.TraineeModel;
import com.cag.dao.ITraineeRepository;
import com.cag.entity.Trainee;

public class EMParser {
	@Autowired
	private ITraineeRepository traineeDAO;
	
	public EMParser() {
		this.traineeDAO= traineeDAO;
	}
	
 public EMParser(ITraineeRepository traineeDAO) {
		super();
		this.traineeDAO = traineeDAO;
	}



	//convert trainee entity to trainee model
	 public Trainee parse(TraineeModel source) {
			return source==null?null:
				new Trainee(source.getTraineeId(), 
						source.getTraineeName(),
						source.getTraineeDomain(),
						source.getTraineeLocation()
						);
		}
	
	 //convert trainee model to trainee entity
	 public TraineeModel parse(Trainee source) {
			return source==null?null:
				new TraineeModel(source.getTraineeId(),
						source.getTraineeName(),
						source.getTraineeDomain(),
						source.getTraineeLocation()
						);
				}



}
