package com.uu;

import org.hibernate.Session;

import model.Rating;
import util.MyUtil;

public class DAOimple implements RatingDAO {
	private Session session;
	@Override
	public void addRating(Rating rate) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSesso();
		session.beginTransaction();
		session.save(rate);
		session.getTransaction().commit();
	}

	/*@Override
	public List<Rating> getRating() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
