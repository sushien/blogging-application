package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CommentsDAO;
import com.dao.Impl.CommentsImple;
import com.model.Comments;


@Service("commentService1")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class CommentServiceImpl implements CommentService{

	@Autowired
    private CommentsDAO commentsDao=new CommentsImple();
	


	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void createcomment(Comments comment) {
		System.out.println("in service"+comment.getCommentId());
		System.out.println("in service"+comment.getUser().getUsername());
		commentsDao.createComment(comment);
	}

}
