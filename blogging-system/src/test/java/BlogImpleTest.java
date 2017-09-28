package com.dao.Impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dao.BlogDAO;
import com.model.Blog;
import com.utility.MyUtil;

public class BlogImpleTest {

	
	

@Test
	public void testCreateBlog() {
	BlogDAO  b1 = new BlogImple();
		Blog se= new Blog();
		se.setBlogTitle("Hi Welcome");
		se.setCategory("Arrtto");
		se.setSummary("New Welcome Page");
		se.setDescription("Hi welcome to new page");
		se.setAuthor("Nikhil Bodke");
		b1.createBlog(se);
		//MyUtil.getSess().getTransaction().commit();
		
		assertEquals("Nikhil Bodke",b1.searchBlogByCategory("Arrtto").get(0).getAuthor());	
		
	}

	@Test
	public void testDeleteBlog() {
		BlogDAO  b1 = new BlogImple();
		
		b1.deleteBlog(6);
		//MyUtil.getSess().getTransaction().commit();
		assertNotEquals("Purnnendu",b1.searchBlogByCategory("Technology").get(0).getAuthor());
		
	}

	@Test
	public void testUpdateBlog() {
		BlogDAO  b1 = new BlogImple();
		Blog b= new Blog();
		b.setBlogTitle("Arrto");
		b.setCategory("Chetan");
		b.setSummary("Dance india Dance");
		b.setDescription("Ek no dance");
		b1.updateBlog(9, b);
		assertEquals("Chetan", b1.searchBlogByKeywordFromTitle("Arrto").get(0).getCategory());

	}

	@Test
	public void testViewBlog() {
		fail("Not yet implemented");
	}
	

	@Test
	public void testSearchBlogByKeywordFromTitle() {
		BlogDAO s = new BlogImple();
		assertEquals("Nokia 6 and Nokia N6",s.searchBlogByKeywordFromTitle("Nokia").get(0).getBlogTitle());
	}

	@Test
	public void testSearchBlogByCategory() {
		BlogDAO s = new BlogImple();
		assertEquals("Technology",s.searchBlogByKeywordFromTitle("Nokia 6 and Nokia N6").get(0).getCategory());
	}

	@Test
	public void testSearchBlogByAuthor() {
		BlogDAO s = new BlogImple();
		assertEquals("Amit ",s.searchBlogByKeywordFromTitle("Nokia 6 and Nokia N6").get(0).getAuthor());
	}

	@Test
	public void testAverageRating() {
		BlogDAO x = new BlogImple();
		
		assertEquals(2,x.searchBlogByCategory("chetan").get(0).getAverageRating());
			
		
	}

}
