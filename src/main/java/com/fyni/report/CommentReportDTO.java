package com.fyni.report;

//event_ID         INT         NOT NULL, -- 이벤트아이디
//comment_ID       INT         NOT NULL, -- 코멘트아이디
//comment_Content  VARCHAR(90) NULL,     -- 내용
//comment_Category VARCHAR(30) NULL      -- 신고_종류
public class CommentReportDTO {
	private int event_ID;
	private int comment_ID;
	private String comment_Content;
	private String comment_Category;
	public CommentReportDTO(int event_ID, int comment_ID, String comment_Content, String comment_Category) {
		super();
		this.event_ID = event_ID;
		this.comment_ID = comment_ID;
		this.comment_Content = comment_Content;
		this.comment_Category = comment_Category;
	}
	public CommentReportDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CommentReportDTO [event_ID=" + event_ID + ", comment_ID=" + comment_ID + ", comment_Content="
				+ comment_Content + ", comment_Category=" + comment_Category + "]";
	}
	public int getEvent_ID() {
		return event_ID;
	}
	public void setEvent_ID(int event_ID) {
		this.event_ID = event_ID;
	}
	public int getComment_ID() {
		return comment_ID;
	}
	public void setComment_ID(int comment_ID) {
		this.comment_ID = comment_ID;
	}
	public String getComment_Content() {
		return comment_Content;
	}
	public void setComment_Content(String comment_Content) {
		this.comment_Content = comment_Content;
	}
	public String getComment_Category() {
		return comment_Category;
	}
	public void setComment_Category(String comment_Category) {
		this.comment_Category = comment_Category;
	}
	
	
}
