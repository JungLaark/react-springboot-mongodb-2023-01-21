package com.laark.practice.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.laark.practice.vo.Movie;
/*잘하고 있는거겠지?? */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
	Optional<Movie> findMovieByImdbId(String imdbId);
}
