package com.dao;

import java.util.List;
import com.model.*;

public interface CommentsDAO {
	
			public void createComment(Comments comment);
			public List<Comments> getComment(int blogid);
		public void removeComment(int comid);
		


}
