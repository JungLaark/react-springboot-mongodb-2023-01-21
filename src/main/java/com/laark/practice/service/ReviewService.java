package com.laark.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.laark.practice.repository.ReviewRepository;
import com.laark.practice.vo.Movie;
import com.laark.practice.vo.Review;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private MongoTemplate mongoTemplate;
	
	/*리뷰 생성*/
	public Review createReview(String reviewBody, String imdbId) {
		Review review = reviewRepository.insert(new Review(reviewBody));
		
		System.out.println(reviewBody);
		System.out.println(imdbId);
		
		/*이건 뭐여 LINQ 같은 느낌*/
		mongoTemplate.update(Movie.class)
						.matching(Criteria.where("imdbId").is(imdbId))
						.apply(new Update().push("reviewIds").value(review))
						.first();
		
		return review;
	}
}
