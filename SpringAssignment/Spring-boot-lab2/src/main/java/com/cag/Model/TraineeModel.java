package com.cag.Model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TraineeModel {
	
	@NotNull(message="Trainee Id cannot be null")
	@NotEmpty(message="Trainee Id cannot be Empty ")
	private Long TraineeId;
	
	@NotEmpty(message = "Name cannot be empty")
	@NotNull(message = "Name cannot be null")
	private String traineeName;
	
	@NotEmpty(message = "Domain cannot be empty")
	@NotNull(message = "Domain cannot be null")
	private String traineeDomain;
	
	@NotEmpty(message = "Location cannot be empty")
	@NotNull(message = "Location cannot be null")
	private String traineeLocation;
	
	public TraineeModel() {
		//no impl
	}

	public TraineeModel(
			@NotNull(message = "Trainee Id cannot be null") @NotEmpty(message = "Trainee Id cannot be Empty ") Long traineeId,
			@NotEmpty(message = "Name cannot be empty") @NotNull(message = "Name cannot be null") String traineeName,
			@NotEmpty(message = "Domain cannot be empty") @NotNull(message = "Domain cannot be null") String traineeDomain,
			@NotEmpty(message = "Location cannot be empty") @NotNull(message = "Location cannot be null") String traineeLocation) {
		super();
		TraineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	public Long getTraineeId() {
		return TraineeId;
	}

	public void setTraineeId(Long traineeId) {
		TraineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TraineeId == null) ? 0 : TraineeId.hashCode());
		result = prime * result + ((traineeDomain == null) ? 0 : traineeDomain.hashCode());
		result = prime * result + ((traineeLocation == null) ? 0 : traineeLocation.hashCode());
		result = prime * result + ((traineeName == null) ? 0 : traineeName.hashCode());
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
		TraineeModel other = (TraineeModel) obj;
		if (TraineeId == null) {
			if (other.TraineeId != null)
				return false;
		} else if (!TraineeId.equals(other.TraineeId))
			return false;
		if (traineeDomain == null) {
			if (other.traineeDomain != null)
				return false;
		} else if (!traineeDomain.equals(other.traineeDomain))
			return false;
		if (traineeLocation == null) {
			if (other.traineeLocation != null)
				return false;
		} else if (!traineeLocation.equals(other.traineeLocation))
			return false;
		if (traineeName == null) {
			if (other.traineeName != null)
				return false;
		} else if (!traineeName.equals(other.traineeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TraineeModel [TraineeId=" + TraineeId + ", traineeName=" + traineeName + ", traineeDomain="
				+ traineeDomain + ", traineeLocation=" + traineeLocation + "]";
	}
	
	

}
