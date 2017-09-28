package com.dao.Impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dao.UserDAO;
import com.model.User;

public class UserImpleTest {

	

	@Test
	public void testCreateUser() {
		UserDAO u = new UserImple();
		User uu = new User();
		uu.setUserType("admin");
		uu.setUsername("Amit");
		uu.setPassword("Amit@123");
		u.createUser(uu);
		assertEquals(true,u.findUser("Amit", "Amit@123"));
	}

	@Test
	public void testFindUser() {
		fail("Not yet implemented");
	}

}
