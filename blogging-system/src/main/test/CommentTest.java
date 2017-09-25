package BlogComment;

import model.Blog;
import model.Comment;
import model.User;

public class Test {
	public static void main(String[] args) {
		Comment com = new Comment();
		//com.setCommentId(101);
		com.setComments("HI");
		User ser= new User();ser.setUsername("Nikh");
		com.setUser(ser);Blog blog = new Blog();
		//blog.setBlogId(2000);
		com.setBlog(blog);
		ComDAO dao = new DaoImple();
		dao.createComment(com);
		System.out.println("object inserted");

	}

}
