package com.laark.practice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laark.practice.service.ReviewService;
import com.laark.practice.vo.Review;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	
	/*리뷰 저장*/
	@PostMapping
	public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payLoad){
		return new ResponseEntity<Review>(reviewService.createReview(payLoad.get("reviewBody"), payLoad.get("imdbId")), HttpStatus.CREATED);
	}
}
