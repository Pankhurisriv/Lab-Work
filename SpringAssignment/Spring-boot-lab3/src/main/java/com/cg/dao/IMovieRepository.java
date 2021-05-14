package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.MovieEntity;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Long>{

	MovieEntity findByCategory(String Genre);
}
