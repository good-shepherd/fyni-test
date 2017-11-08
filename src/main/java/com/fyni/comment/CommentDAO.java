package com.fyni.comment;

import java.util.List;

public interface CommentDAO {
	
	public int commentCreate(CommentDTO comment);

	public CommentDTO commentRead(int comment_ID);
	
	public int commentUpdate(CommentDTO comment);
	
	public int commentDelete(int comment_ID);
	
	public List<CommentDTO> commentReadAll();
	
	public List<CommentDTO> commentUserOwn(String user_ID);

}
