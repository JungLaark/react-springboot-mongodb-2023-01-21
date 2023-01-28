package com.laark.practice.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.laark.practice.vo.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId>{
	
}
