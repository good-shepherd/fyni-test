package com.fyni.comment;

import java.util.List;

public interface CommentService {
	
	public int commentCreate(CommentDTO comment);

	public int commentUpdate(CommentDTO comment);

	public int commentDelete(int comment_ID);

	public List<CommentDTO> commentEventOwn(int event_ID);

	public List<CommentDTO> commentUserOwn(String user_ID);
}
