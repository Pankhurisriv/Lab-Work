package com.cag.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.cag.Model.TraineeModel;
import com.cag.dao.ITraineeRepository;
import com.cag.entity.Trainee;
import com.cag.exception.TraineeIdNotFoundException;

public class TraineeServiceImpl implements ITraineeService {
	
	@Autowired
	private ITraineeRepository traineeDAO;
	
	@Autowired
	private EMParser parser;
	
	public TraineeServiceImpl() {
		this.parser = new EMParser();
	}
	
   public TraineeServiceImpl(ITraineeRepository traineeDAO) {
		super();
		this.traineeDAO = traineeDAO;
		this.parser = new EMParser();
   }
	
	

	@Override
	public TraineeModel addTrainee(TraineeModel traineeModel) throws TraineeIdNotFoundException {
		if (traineeModel != null) {
			if (traineeDAO.existsById(traineeModel.getTraineeId())) {
				throw new TraineeIdNotFoundException ("trainee with this id already exists");
			}

			traineeModel = parser.parse(traineeDAO.save(parser.parse(traineeModel)));
		}

		return traineeModel;
	}

	@Override
	public TraineeModel updateTrainee(TraineeModel traineeModel) throws TraineeIdNotFoundException {
		  Trainee oldTrainee= traineeDAO.findById(traineeModel.getTraineeId()).orElse(null);
			if (oldTrainee == null) {
				throw new TraineeIdNotFoundException("no trainee with id #" +  traineeModel.getTraineeId() + " present");
			} else {
				 traineeModel = parser.parse(traineeDAO.save(parser.parse( traineeModel)));
			}
			return  traineeModel;
	}

	@Override
	public boolean removeTrainee(Long traineeId) throws TraineeIdNotFoundException {
		 Trainee oldTrainee= traineeDAO.findById(traineeId).orElse(null);
			boolean isDeleted=false;
			if (oldTrainee == null) {
				throw new TraineeIdNotFoundException("Trainee with id #" + traineeId + " is not  present");
			} else {
				traineeDAO.deleteById(traineeId);
				isDeleted=true;
			}
			return isDeleted;
		}
		
	

	@Override
	public TraineeModel viewTraineeById(Long traineeId) throws TraineeIdNotFoundException {
		Trainee oldTrainee= traineeDAO.findById(traineeId).orElse(null);
			if (oldTrainee== null) {
				throw new TraineeIdNotFoundException("no trainee with id #" + traineeId + " present");
			}
			return parser.parse(traineeDAO.findById(traineeId).orElse(null));
	}

	@Override
	public List<TraineeModel> viewallTrainee() throws TraineeIdNotFoundException {
		return traineeDAO.findAll().stream().map(parser::parse).collect(Collectors.toList());

	}

}
