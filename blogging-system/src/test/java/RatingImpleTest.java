package com.dao.Impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.model.Rating;

public class RatingImpleTest {

	

	@Test
	public void testAddRating() {
		RatingImple r = new RatingImple();
		Rating rr = new Rating();
		rr.setRating(4);
		assertEquals(4,r.addRating(rr).getRating());
			
	}

}
