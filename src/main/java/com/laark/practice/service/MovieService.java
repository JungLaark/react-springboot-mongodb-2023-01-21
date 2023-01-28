package com.laark.practice.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laark.practice.repository.MovieRepository;
import com.laark.practice.vo.Movie;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> allMovies(){
		System.out.println(movieRepository.findAll().toString());
		return movieRepository.findAll();
	}
	
	/*Optional: null 이 나더라도 NullPointerException 이 일어나지 않는다.*/
	public Optional<Movie> singleMovie(ObjectId id) {
		return movieRepository.findById(id);
	}
	
	public Optional<Movie> singleImdbIdMovie(String imdbId){
		return movieRepository.findMovieByImdbId(imdbId);
	}
}
