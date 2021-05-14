package com.cag.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cag.entity.Trainee;

@Repository
public interface ITraineeRepository extends JpaRepository<Trainee, Long> {

}
