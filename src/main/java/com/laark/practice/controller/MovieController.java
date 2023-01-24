package com.laark.practice.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laark.practice.service.MovieService;
import com.laark.practice.vo.Movie;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
	
//	@GetMapping
//	public String allMovies() {
//		return "All Movies";
//	}
	//responseEntity 쓰는 이유? 
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies(){
		return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);  
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Movie> getSingleMovie(@PathVariable ObjectId id){
		return 
	}
}