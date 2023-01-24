package com.laark.practice.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.laark.practice.vo.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{

}
