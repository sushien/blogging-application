package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import DAOinterface.CommentDAO;
import model.Comment;

import util.MyUtil;



public class Sample implements CommentDAO {
	   private Session session;

	@Override
	public void createcomment(Comment comment) {
		this.session=MyUtil.getSesso();
		
			session.getSessionFactory();
			session.beginTransaction();
			session.save(comment);
			session.getTransaction().commit();
			session.close();
			
			}
		
		
	

	

	

	@Override
	public List<Comment> getComment() {
		List<Comment> result;
		try{
			session.getSessionFactory();
			session.beginTransaction();
			
			Query query=session.createQuery("FROM comments");
			result=query.list();
			
			session.getTransaction().commit();
			}catch(Exception e){
				//LOGGER.debug(e.getMessage());
				throw new RuntimeException(e.getMessage());
			}
		return result;
	}

	

	@Override
	public void removecomment(Comment UserMine) {
		// TODO Auto-generated method stubsession.getSessionFactory();
		session.beginTransaction();
		Query query=session.createQuery("delete comments from Comment where commentId='");
		query.executeUpdate();
		session.getTransaction().commit();
		
	}

	}
