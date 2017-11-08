package com.fyni.report;

import java.util.List;

public interface reportService {
	public int eventReportCreate(EventReportDTO dto);
	public int commentReportCreate(CommentReportDTO dto);
	public List<EventReportDTO> eventReportReadByEvent(int event_ID);
	public List<EventReportDTO> eventReportReadByUser(int user_ID);
	public List<CommentReportDTO> commentReportByEvent(int event_ID);
	public List<CommentReportDTO> commentReportComment(int comment_ID);
}
