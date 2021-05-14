package com.cag.service;

import java.util.List;

import com.cag.Model.TraineeModel;
import com.cag.exception.TraineeIdNotFoundException;

public interface ITraineeService  {
	public TraineeModel addTrainee(TraineeModel traineeModel) throws TraineeIdNotFoundException;
	
	public TraineeModel updateTrainee(TraineeModel traineeModel) throws TraineeIdNotFoundException;
	
	public boolean removeTrainee(Long traineeId) throws TraineeIdNotFoundException;
	
	public TraineeModel viewTraineeById(Long traineeId) throws TraineeIdNotFoundException;
	
	public List<TraineeModel> viewallTrainee() throws TraineeIdNotFoundException;
	
}
