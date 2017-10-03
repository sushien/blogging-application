package com.dao;

import java.util.List;
import com.model.*;

//Comments Interface
public interface CommentsDAO {

	public void createcomment(Comments comment);
	public List<Comments> getcomment(int blogid);
	public void removecomment(int comid);

}
